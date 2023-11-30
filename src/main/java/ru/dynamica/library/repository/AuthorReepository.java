package ru.dynamica.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dynamica.library.model.entity.AuthorEntity;

@Repository
public interface AuthorReepository extends JpaRepository<AuthorEntity, Long> {

}
