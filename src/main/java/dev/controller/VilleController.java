package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Ville;
import dev.exception.RepoException;
import dev.service.VilleService;

@RestController
@RequestMapping("api/ville")
public class VilleController {
	
	private VilleService villeService;

	/**
	 * @param villeService
	 */
	public VilleController(VilleService villeService) {
		super();
		this.villeService = villeService;
	}

	
	@GetMapping
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(villeService.readAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(villeService.readById(id));
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody Ville ville) {
		return ResponseEntity.ok().body(villeService.create(ville));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		try {
			villeService.delete(id);
			return ResponseEntity.ok().body("Ville effacée");
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

}
