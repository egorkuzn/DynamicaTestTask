package ru.dynamica.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO для сущности, которая хранит мета-информацию о книге.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {
    private Long id;

    private String ISBN;

    private String title;

    private Long authorId;
}
