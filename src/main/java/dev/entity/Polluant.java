package dev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Polluant extends SuperEntity{
	
	private String nom;
	@Column(scale = 4, precision = 2)
	private Double valeur;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getValeur() {
		return valeur;
	}
	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}
	
	

}
