package dev.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Rubrique;
import dev.exception.RepoException;
import dev.service.RubriqueService;

@RestController
@RequestMapping("/api/rubrique")
public class RubriqueController {

	private RubriqueService rubriqueService;

	/**
	 * @param rubriqueSevice
	 */
	public RubriqueController(RubriqueService rubriqueService) {
		super();
		this.rubriqueService = rubriqueService;
	}

	@GetMapping
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(rubriqueService.readAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(rubriqueService.readById(id));
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody Rubrique rubrique) {
		return ResponseEntity.ok().body(rubriqueService.create(rubrique));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		try {
			rubriqueService.delete(id);
			return ResponseEntity.ok().body("Rubrique effacée");
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

}
