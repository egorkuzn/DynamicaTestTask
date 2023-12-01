package ru.dynamica.library.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RentKeyEntity implements Serializable {
    @Column(name = "book_id")
    Long bookId;

    @Column(name = "client_id")
    Long clientId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentKeyEntity that = (RentKeyEntity) o;
        return Objects.equals(bookId, that.bookId) && Objects.equals(clientId, that.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, clientId);
    }
}
