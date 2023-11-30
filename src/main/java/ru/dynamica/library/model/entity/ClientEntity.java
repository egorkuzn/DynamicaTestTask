package ru.dynamica.library.model.entity;

import lombok.*;
import org.hibernate.annotations.Entity;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

/**
 * Представляет сущность, которая хранит мета-информацию о клиенте.
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "client")
public class ClientEntity extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "fathername", nullable = false)
    private String fathername;

    @Column(name = "birthday", nullable = false)
    private Date birthday;
}
