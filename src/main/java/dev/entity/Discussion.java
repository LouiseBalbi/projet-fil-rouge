package dev.entity;

import javax.persistence.Entity;

@Entity
public class Discussion extends SuperEntity {
	
	private String titre;

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	

}

