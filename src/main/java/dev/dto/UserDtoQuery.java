package dev.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dev.enumerations.Role;

public class UserDtoQuery {

	private Long id;
	private LocalDate dateAjout;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private Role role;
//	private List<Long> favorisId = new ArrayList<>();
//
//	private List<Long> rubriquesId = new ArrayList<>();
//
//	private List<Long> discussionId = new ArrayList<>();
//
//	private List<Long> messagesId = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(LocalDate dateAjout) {
		this.dateAjout = dateAjout;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

//	public List<Long> getFavorisId() {
//		return favorisId;
//	}
//
//	public void setFavorisId(List<Long> favorisId) {
//		this.favorisId = favorisId;
//	}
//
//	public List<Long> getRubriquesId() {
//		return rubriquesId;
//	}
//
//	public void setRubriquesId(List<Long> rubriquesId) {
//		this.rubriquesId = rubriquesId;
//	}
//
//	public List<Long> getDiscussionId() {
//		return discussionId;
//	}
//
//	public void setDiscussionId(List<Long> discussionId) {
//		this.discussionId = discussionId;
//	}
//
//	public List<Long> getMessagesId() {
//		return messagesId;
//	}
//
//	public void setMessagesId(List<Long> messagesId) {
//		this.messagesId = messagesId;
//	}
	
	

}
