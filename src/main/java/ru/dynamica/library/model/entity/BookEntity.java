package ru.dynamica.library.model.entity;

import lombok.*;

import javax.persistence.*;

import java.util.Objects;

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
        name = "book_metadata",
        uniqueConstraints = @UniqueConstraint(
                name = ISBN_AND_ID_UNIQUE,
                columnNames = {"isbn", "id"}
        )
)
public class BookEntity extends BaseEntity {
    public static final String ISBN_AND_ID_UNIQUE = "isbn_and_id_unique";

    @Column(name = "isbn", nullable = false)
    private String ISBN;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private AuthorEntity author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return Objects.equals(ISBN, that.ISBN) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title);
    }
}
