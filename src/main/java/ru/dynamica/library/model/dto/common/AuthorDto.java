package ru.dynamica.library.model.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "Id автора", example = "1")
    private Long id;

    @Schema(description = "Имя", example = "Фёдор")
    private String name;

    @Schema(description = "Фамилия", example = "Достоевский")
    private String surname;

    @Schema(description = "Отчество", example = "Михайлович")
    private String fathername;
}
