package dev.repository;

import dev.entity.Meteo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeteoRepository extends JpaRepository<Meteo, Long> {
}
