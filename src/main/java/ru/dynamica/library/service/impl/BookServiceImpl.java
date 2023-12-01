package ru.dynamica.library.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamica.library.exception.NotFoundException;
import ru.dynamica.library.mapper.BookMapper;
import ru.dynamica.library.model.dto.BookDto;
import ru.dynamica.library.model.entity.AuthorEntity;
import ru.dynamica.library.model.entity.BookEntity;
import ru.dynamica.library.repository.AuthorRepository;
import ru.dynamica.library.repository.BookRepository;
import ru.dynamica.library.service.BookService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final AuthorRepository authorRepository;

    @Override
    public List<BookDto> getBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::authorEnityToAuthorDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookDto addBook(BookDto newBook) {
        bookRepository.save(bookMapper.authorDtoToAuthorEnity(newBook));
        return newBook;
    }

    @Override
    public BookDto updateBook(Long id, String attribute, String newValue) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(() -> new NotFoundException("Книга не найдена"));
        updateByAttribute(bookEntity, attribute, newValue);
        bookRepository.save(bookEntity);
        return bookMapper.authorEnityToAuthorDto(bookEntity);
    }

    /**
     * Я знаю, что это можно было сделать через рефлекшн, но уже пофиг
     */
    private void updateByAttribute(
            BookEntity bookEntity,
            String attribute,
            String newValue
    ) {
        switch (attribute) {
            case "title":
                bookEntity.setTitle(newValue);
                break;
            case "author":
                bookEntity.setAuthor(findAuthorById(newValue));
                break;
            case "isbn":
                bookEntity.setISBN(newValue);
                break;
            default:
                throw new NotFoundException("Поле для обновления не найдено");
        }
    }

    private AuthorEntity findAuthorById(String newValue) {
        return authorRepository.findById(
                Long.parseLong(newValue)
        ).orElseThrow(() ->
                new NotFoundException("Автор в репозитории не найден" +
                        " по такому id, поэтому не получилось обновить книгу")
        );
    }
}
