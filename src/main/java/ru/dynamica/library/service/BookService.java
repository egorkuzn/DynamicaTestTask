package ru.dynamica.library.service;

import ru.dynamica.library.model.dto.BookDto;

import java.util.List;

public interface BookService {
    List<BookDto> getBooks();

    BookDto addBook(BookDto newBook);

    BookDto updateBook(int id, String attribute, String newValue);
}
