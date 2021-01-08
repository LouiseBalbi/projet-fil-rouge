package dev.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Ville;
import dev.exception.RepoException;
import dev.repository.VilleRepository;

@Service
public class VilleService {

	private VilleRepository villeRepo;

	/**
	 * @param villeRepo
	 */
	public VilleService(VilleRepository villeRepo) {
		super();
		this.villeRepo = villeRepo;
	}

	
	public List<Ville> readAll() {

		List<Ville> listeV = new ArrayList<>();
		for (Ville ville : villeRepo.findAll()) {
			listeV.add(ville);
		}
		return listeV;

	}

	public Ville readById(Long id) throws RepoException {
		Optional<Ville> optVille = villeRepo.findById(id);
		if (optVille.isPresent()) {
			return optVille.get();
		} else {
			throw new RepoException("id_ville non trouvé");
		}
	}

	public Ville create(Ville ville) {
		return villeRepo.save(ville);
	}

	public void delete(Long id) throws RepoException {
		villeRepo.delete(this.readById(id));
	}

}
