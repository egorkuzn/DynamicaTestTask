package ru.dynamica.library.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import static ru.dynamica.library.model.entity.BookEntity.ISBN_AND_ID_UNIQUE;

/**
 * Представляет сущность, которая хранит мета-информацию о книге.
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(
        name = "version_metadata",
        uniqueConstraints = @UniqueConstraint(
                name = ISBN_AND_ID_UNIQUE,
                columnNames = {"ISBN", "id"}
        )
)
public class BookEntity extends BaseEntity {
    public static final String ISBN_AND_ID_UNIQUE = "isbn_and_id_unique";

}
