package dev.service;

import dev.entity.Meteo;
import dev.exception.RepoException;
import dev.repository.MeteoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MeteoService {
    private MeteoRepository meteoRepo;

    public MeteoService(MeteoRepository meteoRepo) {
        this.meteoRepo = meteoRepo;
    }

    public List<Meteo> readAll() {
        List<Meteo> listeM = new ArrayList<>();
        for ( Meteo meteo : meteoRepo.findAll()) {
            listeM.add(meteo);
        }
        return meteoRepo.findAll();
    }

    public Meteo readById(Long id) throws RepoException {
        Optional<Meteo> optMeteo = meteoRepo.findById(id);
        if (optMeteo.isPresent()) {
            return optMeteo.get();
        } else {
            throw new RepoException("id_meteo non trouvé");
        }
    }

    public Meteo create(Meteo meteo) {
        return meteoRepo.save(meteo);
    }

    public void delete(Long id) throws RepoException {
        meteoRepo.delete(this.readById(id));
    }
}
