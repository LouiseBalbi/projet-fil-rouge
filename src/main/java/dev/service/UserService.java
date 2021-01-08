package dev.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.User;
import dev.exception.RepoException;
import dev.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepo;

	/**
	 * @param userRepo
	 */
	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
public List<User> readAll(){
		
		List<User> listeU = new ArrayList<>();
		for (User user : userRepo.findAll()) {
			listeU.add(user);
		}
		return listeU;

	}
	
	public User readById(Long id) throws RepoException {
		Optional<User> optUser = userRepo.findById(id);
		if(optUser.isPresent()) {
			return optUser.get();
		}else {
			throw new RepoException("id_user non trouvé");
		}
	}
	
	public User create(User user) {
		return userRepo.save(user);
	}
	
	public void delete(Long id) throws RepoException {
		userRepo.delete(this.readById(id));
	}
	

}
