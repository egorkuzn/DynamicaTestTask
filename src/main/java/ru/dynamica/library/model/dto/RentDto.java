package ru.dynamica.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * DTO для сущности, которая хранит заказы в библиотеке.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RentDto {
    Long bookId;

    Long clientId;

    Date rentStartDate;
}
