package ru.dynamica.library.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamica.library.model.dto.LibraryDto;
import ru.dynamica.library.service.*;

@Service
@AllArgsConstructor
public class LibraryServiceImpl implements LibraryService {
    private final BookService bookService;
    private final ClientService clientService;
    private final AuthorService authorService;
    private final RentService rentService;

    @Override
    public LibraryDto getLibraryInfo() {
        return LibraryDto.builder()
                .books(bookService.getBooks())
                .clients(clientService.getClients())
                .authors(authorService.getAuthors())
                .rents(rentService.getRents())
                .build();
    }
}
