package dev.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Discussion extends SuperEntity {
	
	private String titre;
	
	@OneToMany( targetEntity=Message.class, mappedBy="discussion" )
	private List<Message> messages = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "rubrique_id")
	private Rubrique rubrique;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Rubrique getRubrique() {
		return rubrique;
	}

	public void setRubrique(Rubrique rubrique) {
		this.rubrique = rubrique;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}

