package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(discussionServ.readAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(discussionServ.readById(id));
        } catch (RepoException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Discussion discussion) {
        return ResponseEntity.ok().body(discussionServ.create(discussion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            discussionServ.delete(id);
            return ResponseEntity.ok().body("discussion supprimée");
        } catch (RepoException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
