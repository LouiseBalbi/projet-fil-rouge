package dev.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dev.entity.Discussion;
import dev.entity.Favori;
import dev.entity.Rubrique;
import dev.entity.SuperMessage;
import dev.entity.User;
import dev.enumerations.Role;

public class UserDtoReponse {
	
	private Long id;
	private LocalDate dateAjout;
	private String nom;
	private String prenom;
	private String email;

	//TODO à mettre à jour
	private List<Favori> favoris = new ArrayList<>();

	private List<Rubrique> rubriques = new ArrayList<>();

	private List<Discussion> discussion = new ArrayList<>();

	private List<SuperMessage> messages = new ArrayList<>();

	/**
	 * @param id
	 * @param dateAjout
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param favoris
	 * @param rubriques
	 * @param discussion
	 * @param messages
	 */
	public UserDtoReponse(User user) {
		super();
		this.id = user.getId();
		this.dateAjout = user.getDateAjout();
		this.nom = user.getNom();
		this.prenom = user.getPrenom();
		this.email = user.getEmail();
//		this.favoris = favoris;
//		this.rubriques = rubriques;
//		this.discussion = discussion;
//		this.messages = messages;
	}
	
	

}
