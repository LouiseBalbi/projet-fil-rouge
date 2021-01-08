package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.User;
import dev.exception.RepoException;
import dev.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private UserService userService;

	/**
	 * @param userService
	 */
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(userService.readAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(userService.readById(id));
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody User user) {
		return ResponseEntity.ok().body(userService.create(user));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		try {
			userService.delete(id);
			return ResponseEntity.ok().body("Rubrique effacée");
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

}
