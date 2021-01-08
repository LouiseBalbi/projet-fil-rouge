package dev.service;

import dev.entity.Favori;
import dev.exception.RepoException;
import dev.repository.FavoriRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriService {

    private FavoriRepository favoriRepo;

    public FavoriService(FavoriRepository favoriRepo) {
        this.favoriRepo = favoriRepo;
    }

    public List<Favori> readAll() {
        return favoriRepo.findAll();
    }

    public Favori readById(Long id) throws RepoException {
        Optional<Favori> optFavori = favoriRepo.findById(id);
        if (optFavori.isPresent()) {
            return optFavori.get();
        } else {
            throw new RepoException("id_favori non trouvé");
        }
    }

    public Favori create(Favori favori) {
        return favoriRepo.save(favori);
    }

    public void delete(Long id) throws RepoException {
        favoriRepo.delete(this.readById(id));
    }
}
