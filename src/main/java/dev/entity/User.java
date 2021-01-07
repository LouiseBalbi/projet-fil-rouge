package dev.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import dev.enumerations.Role;

@Entity
public class User extends SuperEntity {

	private String nom;
	private String prenom;
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToMany(targetEntity = Favori.class, mappedBy = "user")
	private List<Favori> favoris = new ArrayList<>();
	
	@OneToMany(targetEntity = Rubrique.class, mappedBy = "user")
	private List<Rubrique> rubriques = new ArrayList<>();
	
	@OneToMany(targetEntity = Discussion.class, mappedBy = "user")
	private List<Discussion> discussion = new ArrayList<>();
	
	@OneToMany(targetEntity = SuperMessage.class, mappedBy = "user")
	private List<SuperMessage> messages = new ArrayList<>();

	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Favori> getFavoris() {
		return favoris;
	}
	public void setFavoris(List<Favori> favoris) {
		this.favoris = favoris;
	}
	public List<Rubrique> getRubriques() {
		return rubriques;
	}
	public void setRubriques(List<Rubrique> rubriques) {
		this.rubriques = rubriques;
	}
	public List<Discussion> getDiscussion() {
		return discussion;
	}
	public void setDiscussion(List<Discussion> discussion) {
		this.discussion = discussion;
	}
	public List<SuperMessage> getMessages() {
		return messages;
	}
	public void setMessages(List<SuperMessage> messages) {
		this.messages = messages;
	}
	
	

}
