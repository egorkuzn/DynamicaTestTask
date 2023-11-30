package ru.dynamica.library.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamica.library.mapper.BookMapper;
import ru.dynamica.library.model.dto.BookDto;
import ru.dynamica.library.model.entity.BookEntity;
import ru.dynamica.library.repository.BookRepository;
import ru.dynamica.library.service.BookService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

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
    public BookDto updateBook(int id, String attribute, String newValue) {
        return bookRepository.findById(id).orElseThrow(() -> new NotFo("Продукт c id " + productId + " не найден."));
    }
}
