package ru.dynamica.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO для сущности, которая хранит мета-информацию о авторе.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDto {
    private Long id;

    private String name;

    private String surname;

    private String fathername;
}
