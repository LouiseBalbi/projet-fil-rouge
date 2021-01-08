package dev.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Polluant;
import dev.entity.Rubrique;
import dev.exception.RepoException;
import dev.repository.PolluantRepository;

@Service
public class PolluantService {
	
	private PolluantRepository polluantRepo;

	/**
	 * @param polluantRepo
	 */
	public PolluantService(PolluantRepository polluantRepo) {
		super();
		this.polluantRepo = polluantRepo;
	}
	
public List<Polluant> readAll(){
		
		List<Polluant> listeP = new ArrayList<>();
		for (Polluant polluant : polluantRepo.findAll()) {
			listeP.add(polluant);
		}
		return listeP;

	}
	
	public Polluant readById(Long id) throws RepoException {
		Optional<Polluant> optPolluant = polluantRepo.findById(id);
		if(optPolluant.isPresent()) {
			return optPolluant.get();
		}else {
			throw new RepoException("id_polluant non trouvé");
		}
	}
	
	public Polluant create(Polluant polluant) {
		return polluantRepo.save(polluant);
	}
	
	public void delete(Long id) throws RepoException {
		polluantRepo.delete(this.readById(id));
	}

}
