package ru.dynamica.library.model.entity;

import lombok.*;
import org.hibernate.annotations.Entity;

import javax.persistence.Table;

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
}
