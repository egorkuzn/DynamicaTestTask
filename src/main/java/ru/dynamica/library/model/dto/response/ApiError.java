package ru.dynamica.library.model.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO для ошибки API.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiError {
    @Schema(description = "Код ошибки.", example = "404")
    private int code;

    @Schema(description = "Сообщение с информацией об ошибке.",
            example = "Продукт с идентификатором 1 не найден.")
    private String message;
}
