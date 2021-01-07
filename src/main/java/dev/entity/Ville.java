package dev.entity;

import javax.persistence.Entity;

@Entity
public class Ville extends SuperEntity {

	private String nomVille;
	private String codeInsee;
	private String codePostal;
	private Long nbHab;
	private String region;
	
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public String getCodeInsee() {
		return codeInsee;
	}
	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public Long getNbHab() {
		return nbHab;
	}
	public void setNbHab(Long nbHab) {
		this.nbHab = nbHab;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
