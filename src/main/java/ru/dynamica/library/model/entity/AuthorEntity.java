package ru.dynamica.library.model.entity;

import lombok.*;
import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * Представляет сущность, которая хранит мета-информацию о авторе.
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "author_metadata")
public class AuthorEntity extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "fathername", nullable = true)
    private String fathername;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    @CollectionTable(name = "books")
    private Set<BookEntity> books;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorEntity that = (AuthorEntity) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(fathername, that.fathername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, fathername);
    }
}
