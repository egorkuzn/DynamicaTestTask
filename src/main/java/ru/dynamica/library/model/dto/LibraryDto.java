package ru.dynamica.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO для сущности, которая хранит мета-информацию о библиотеке.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibraryDto {
    List<ClientDto> clients;

    List<AuthorDto> authors;

    List<BookDto> books;

    List<RentDto> rents;
}
