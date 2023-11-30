package ru.dynamica.library.service.impl;

import org.springframework.stereotype.Service;
import ru.dynamica.library.model.dto.common.BookDto;
import ru.dynamica.library.service.BookRentService;

import java.util.List;

@Service
public class BookRentServiceImpl implements BookRentService {
    @Override
    public List<BookDto> getBooks() {
        return null;
    }
}
