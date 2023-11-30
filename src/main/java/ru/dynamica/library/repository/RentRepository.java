package ru.dynamica.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dynamica.library.model.entity.RentEntity;

@Repository
public interface RentRepository extends JpaRepository<RentEntity, Long> {
}
