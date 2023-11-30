package ru.dynamica.library.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

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
