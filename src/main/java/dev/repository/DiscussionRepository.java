package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Discussion;

public interface DiscussionRepository extends JpaRepository<Discussion, Long> {

}
