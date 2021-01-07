package dev.entity;

import javax.persistence.Entity;

@Entity
public class Favori extends SuperEntity {
	
	private Ville ville;
	private Boolean showMeteo;
	private Boolean showAir;
	private String polluant;
	
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
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
	
	

}
