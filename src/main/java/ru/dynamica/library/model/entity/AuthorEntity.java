package ru.dynamica.library.model.entity;

import lombok.*;
import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.util.List;

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
    private List<BookEntity> books;
}
