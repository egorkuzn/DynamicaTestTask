package ru.dynamica.library.model.dto;

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
    private int code;

    private String message;
}