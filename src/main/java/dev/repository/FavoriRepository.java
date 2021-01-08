package dev.repository;

import dev.entity.Favori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriRepository extends JpaRepository<Favori, Long> {
}
