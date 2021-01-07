package dev.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Rubrique;
import dev.exception.repoException;
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
	public ResponseEntity<?> findAll(){
		List<Rubrique> listeR = rubriqueService.readAll();
		return ResponseEntity.ok().body(listeR);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		try {
			return ResponseEntity.ok().body(rubriqueService.readById(id));
		} catch (repoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Rubrique rubrique){
		return ResponseEntity.ok().body(rubriqueService.create(rubrique));
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(Long id){
		try {
			rubriqueService.delete(id);
			return ResponseEntity.ok().body("Rubrique effacée");
		} catch (repoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}
	
	

}
