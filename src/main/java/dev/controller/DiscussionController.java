package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Discussion;
import dev.exception.RepoException;
import dev.service.DiscussionService;

@RestController
@RequestMapping("api/discussion")
public class DiscussionController {

	private DiscussionService discussionServ;

	public DiscussionController(DiscussionService discussionServ) {
		super();
		this.discussionServ = discussionServ;
	}
	@GetMapping
	public ResponseEntity<?>readAll(){
		return ResponseEntity.ok().body(discussionServ.readAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>readById(@PathVariable Long id){
		try {
			return ResponseEntity.ok().body(discussionServ.readById(id));
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	@PostMapping
	public ResponseEntity<?>create(@RequestBody Discussion discussion){
		return ResponseEntity.ok().body(discussionServ.create(discussion));
	}
	public ResponseEntity<?>delete(Long id){
		try {
			discussionServ.delete(id);
			return ResponseEntity.ok().body("discussion supprimer");
		} catch (RepoException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	
}
