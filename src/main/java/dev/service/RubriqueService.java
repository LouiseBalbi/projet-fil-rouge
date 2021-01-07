package dev.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;



import dev.entity.Rubrique;
import dev.exception.repoException;
import dev.repository.RubriqueRepository;

@Service
public class RubriqueService {

	private RubriqueRepository rubriqueRepo;


	public void setRubriqueRepo(RubriqueRepository rubriqueRepo) {
		this.rubriqueRepo = rubriqueRepo;
	}
	
	public List<Rubrique> readAll(){
		List<Rubrique> listeR = new ArrayList<>();
		for (Rubrique rubrique : rubriqueRepo.findAll()) {
			listeR.add(rubrique);
		}
		return listeR;
	}
	
	public Rubrique readById(Long id) throws repoException {
		Optional<Rubrique> optRubrique = rubriqueRepo.findById(id);
		if(optRubrique.isPresent()) {
			return optRubrique.get();
		}else {
			throw new repoException("id_rubrique non trouvé");
		}
	}
	
	public Rubrique create(Rubrique rubrique) {
		return rubriqueRepo.save(rubrique);
	}
	
	public void delete(Long id) throws repoException {
		rubriqueRepo.delete(this.readById(id));
	}
}
