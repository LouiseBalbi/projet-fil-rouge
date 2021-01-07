package dev.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Favori extends SuperEntity {
	
	
	private Boolean showMeteo;
	private Boolean showAir;
	private String polluant;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
		
	@OneToOne
	@JoinColumn( name="ville_id" )
	private Ville ville;

	public Boolean getShowMeteo() {
		return showMeteo;
	}

	public void setShowMeteo(Boolean showMeteo) {
		this.showMeteo = showMeteo;
	}

	public Boolean getShowAir() {
		return showAir;
	}

	public void setShowAir(Boolean showAir) {
		this.showAir = showAir;
	}

	public String getPolluant() {
		return polluant;
	}

	public void setPolluant(String polluant) {
		this.polluant = polluant;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	

}
