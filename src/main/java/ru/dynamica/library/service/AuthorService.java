package ru.dynamica.library.service;

import ru.dynamica.library.model.dto.AuthorDto;

import java.util.List;

public interface AuthorService {
    List<AuthorDto> getAuthors();
}
