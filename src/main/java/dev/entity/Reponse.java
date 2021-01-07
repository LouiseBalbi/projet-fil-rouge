package dev.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("REPONSE")
public class Reponse extends SuperMessage {
	
	// une réponse appartient à un message ou à une réponse
	@ManyToOne
	@JoinColumn(name = "message_id")
	private SuperMessage messageOrigine;
	
	// une réponse peut avoir une réponse
	@OneToMany( targetEntity=Reponse.class, mappedBy="messageOrigine" )
	private List<Reponse> reponses = new ArrayList<>();

	public SuperMessage getMessageOrigine() {
		return messageOrigine;
	}

	public void setMessageOrigine(SuperMessage messageOrigine) {
		this.messageOrigine = messageOrigine;
	}

	public List<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(List<Reponse> reponses) {
		this.reponses = reponses;
	}
	
	
}
