package dev.controller;

import dev.entity.Meteo;
import dev.exception.RepoException;
import dev.service.MeteoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/meteo")
public class MeteoController {
    private MeteoService meteoService;

    public MeteoController(MeteoService meteoService) {
        this.meteoService = meteoService;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(meteoService.readAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(meteoService.readById(id));
        } catch (RepoException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Meteo meteo) {
        return ResponseEntity.ok().body(meteoService.create(meteo));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(Long id) {
        try {
            meteoService.delete(id);
            return ResponseEntity.ok().body("Meteo effacée");
        } catch (RepoException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
