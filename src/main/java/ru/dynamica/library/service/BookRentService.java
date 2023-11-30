package ru.dynamica.library.service;

import ru.dynamica.library.model.dto.common.BookDto;

import java.util.List;

public interface BookRentService {
    List<BookDto> getBooks();
}
