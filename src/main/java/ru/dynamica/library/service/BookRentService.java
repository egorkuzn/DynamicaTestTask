package ru.dynamica.library.service;

import ru.dynamica.library.model.dto.BookDto;

import java.util.List;

public interface BookRentService {
    List<BookDto> getBooks();
}
