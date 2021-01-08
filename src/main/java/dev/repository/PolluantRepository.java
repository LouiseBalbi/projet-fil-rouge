package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Polluant;

public interface PolluantRepository extends JpaRepository<Polluant, Long>{

}
