package dev.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dto.RubriqueDtoQuery;
import dev.entity.Rubrique;
import dev.entity.User;
import dev.exception.RepoException;
import dev.repository.RubriqueRepository;

@Service
public class RubriqueService {

	private RubriqueRepository rubriqueRepo;
	
	/**
	 * @param rubriqueRepo
	 */
	public RubriqueService(RubriqueRepository rubriqueRepo) {
		super();
		this.rubriqueRepo = rubriqueRepo;
	}

	public List<Rubrique> readAll(){
		
		List<Rubrique> listeR = new ArrayList<>();
		for (Rubrique rubrique : rubriqueRepo.findAll()) {
			listeR.add(rubrique);
		}
		return listeR;

	}
	
	public Rubrique readById(Long id) throws RepoException {
		Optional<Rubrique> optRubrique = rubriqueRepo.findById(id);
		if(optRubrique.isPresent()) {
			return optRubrique.get();
		}else {
			throw new RepoException("id_rubrique non trouvé");
		}
	}
	
	public Rubrique create(RubriqueDtoQuery query) {
		 Rubrique r =new Rubrique();
		 User u = new User();
		 u.setId(query.getUserId());
		 r.setUser(u);
		 r.setDateAjout(query.getDateAjout());
		 //r.setDiscussions(discussions);
		 r.setId(query.getId() != null ? query.getId() : null);
		 r.setTitre(query.getTitre());
		return rubriqueRepo.save(r);
	}
	
	public void delete(Long id) throws RepoException {
		rubriqueRepo.delete(this.readById(id));
	}
}
