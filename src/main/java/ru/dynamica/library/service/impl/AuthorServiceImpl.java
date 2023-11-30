package ru.dynamica.library.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamica.library.mapper.AuthorMapper;
import ru.dynamica.library.model.dto.AuthorDto;
import ru.dynamica.library.repository.AuthorRepository;
import ru.dynamica.library.service.AuthorService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public final List<AuthorDto> getAuthors() {
        return authorRepository.findAll()
                .stream()
                .map(authorMapper::authorEnityToAuthorDto)
                .collect(Collectors.toList());
    }
}
