package dev.controller;

import dev.entity.Favori;
import dev.exception.RepoException;
import dev.service.FavoriService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class FavoriController {

    private FavoriService favoriService;

    public FavoriController(FavoriService favoriService) {
        this.favoriService = favoriService;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(favoriService.readAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(favoriService.readById(id));
        } catch (RepoException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Favori favori) {
        return ResponseEntity.ok().body(favoriService.create(favori));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            favoriService.delete(id);
            return ResponseEntity.ok().body("Favori supprimé");
        } catch (RepoException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
