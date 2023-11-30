package ru.dynamica.library.model.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.dynamica.library.model.entity.BookEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * DTO для сущности, которая хранит заказы в библиотеке.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RentDto {
    @Schema(description = "Id книги", example = "1")
    Long bookId;

    @Schema(description = "Id клиента", example = "1")
    Long clientId;

    @Schema(description = "Дата взятия на прочтение", example = "2022-05-10")
    Date rentStartDate;
}
