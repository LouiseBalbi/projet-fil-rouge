package dev.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Message;
import dev.exception.RepoException;
import dev.repository.MessageRepository;

@Service
public class MessageService {
	
	private MessageRepository messageRepo;

	/**
	 * @param messageRepo
	 */
	public MessageService(MessageRepository messageRepo) {
		super();
		this.messageRepo = messageRepo;
	}
	
public List<Message> readAll(){
		
		List<Message> listeM = new ArrayList<>();
		for (Message message : messageRepo.findAll()) {
			listeM.add(message);
		}
		return listeM;

	}
	
	public Message readById(Long id) throws RepoException {
		Optional<Message> optMessage = messageRepo.findById(id);
		if(optMessage.isPresent()) {
			return optMessage.get();
		}else {
			throw new RepoException("id_message non trouvé");
		}
	}
	
	public Message create(Message message) {
		return messageRepo.save(message);
	}
	
	public void delete(Long id) throws RepoException {
		messageRepo.delete(this.readById(id));
	}
	

}
