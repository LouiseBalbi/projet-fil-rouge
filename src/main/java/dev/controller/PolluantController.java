package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Polluant;
import dev.exception.RepoException;
import dev.service.PolluantService;

@RestController
@RequestMapping("/api/polluant")
public class PolluantController {

	private PolluantService polluantService;

	/**
	 * @param polluantService
	 */
	public PolluantController(PolluantService polluantService) {
		super();
		this.polluantService = polluantService;
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(polluantService.readAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(polluantService.readById(id));
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody Polluant polluant) {
		return ResponseEntity.ok().body(polluantService.create(polluant));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		try {
			polluantService.delete(id);
			return ResponseEntity.ok().body("Polluant effacé");
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}
	
}
