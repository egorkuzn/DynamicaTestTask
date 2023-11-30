package ru.dynamica.library.model.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * DTO для сущности, которая хранит мета-информацию о клиенте.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDto {
    @Schema(description = "Id клиента", example = "1")
    private Long id;

    @Schema(description = "Имя", example = "Иван")
    private String name;

    @Schema(description = "Фамилия", example = "Иванов")
    private String surname;

    @Schema(description = "Отчество", example = "Иванович")
    private String fathername;

    @Schema(description = "День рождения", example = "2010-10-10")
    private Date birthday;
}