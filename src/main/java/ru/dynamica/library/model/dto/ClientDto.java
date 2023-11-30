package ru.dynamica.library.model.dto;

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
    private Long id;

    private String name;

    private String surname;

    private String fathername;

    private Date birthday;
}