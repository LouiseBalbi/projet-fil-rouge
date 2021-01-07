package dev.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("MESSAGE")
public class Message extends SuperMessage{
	
	// un message appartient à une discussion
	@ManyToOne
	@JoinColumn(name = "discussion_id")
	private Discussion discussion;
	
	// un message peut avoir une réponse
	@OneToMany(targetEntity=Reponse.class, mappedBy="messageOrigine")
	private List<Reponse> reponses;

	public Discussion getDiscussion() {
		return discussion;
	}

	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}

	public List<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(List<Reponse> reponses) {
		this.reponses = reponses;
	}
	
	

}
