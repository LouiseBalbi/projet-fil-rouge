package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Message;
import dev.exception.RepoException;
import dev.service.MessageService;

@RestController
@RequestMapping("/api/message")
public class MessageController {
	
	private MessageService messageService;

	/**
	 * @param messageService
	 */
	public MessageController(MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(messageService.readAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		try {
			return ResponseEntity.ok().body(messageService.readById(id));
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody Message message) {
		return ResponseEntity.ok().body(messageService.create(message));
	}

	@DeleteMapping
	public ResponseEntity<?> delete(Long id) {
		try {
			messageService.delete(id);
			return ResponseEntity.ok().body("Message effacé");
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}
	

}
