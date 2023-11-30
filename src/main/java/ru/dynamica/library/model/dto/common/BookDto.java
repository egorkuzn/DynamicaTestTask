package ru.dynamica.library.model.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "Id книги", example = "1")
    private Long id;

    @Schema(description = "ISNB книги", example = "978-2-266-11156-0")
    private String ISBN;

    @Schema(description = "Название книги", example = "Братья Карамазовы")
    private String title;

    @Schema(description = "Автор книги", example = "1")
    private Long authorId;
}
