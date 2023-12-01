package ru.dynamica.library.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Представляет сущность, которая хранит информацию об аренде книг.
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "rent")
public class RentEntity {
    @EmbeddedId
    RentKeyEntity rentKeyEntity;

    @Column(name = "rent_date", nullable = false)
    Date rentStartDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    BookEntity bookId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("clientId")
    @JoinColumn(name = "client_id")
    BookEntity clientId;
}
