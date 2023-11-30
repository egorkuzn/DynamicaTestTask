package ru.dynamica.library.service.impl;

import org.springframework.stereotype.Service;
import ru.dynamica.library.model.dto.BookDto;
import ru.dynamica.library.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<BookDto> getBooks() {
        return null;
    }

    @Override
    public BookDto addBook(BookDto newBook) {
        return null;
    }

    @Override
    public BookDto updateBook(int id, String attribute, String newValue) {
        return null;
    }
}
