package dev.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dev.entity.Discussion;
import dev.entity.User;

public class RubriqueDtoQuery {

	private Long id;
	private LocalDate dateAjout;
	private String titre;

	private List<Long> discussionsId = new ArrayList<>();

	private Long userId;

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

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<Long> getDiscussionsId() {
		return discussionsId;
	}

	public void setDiscussionsId(List<Long> discussionsId) {
		this.discussionsId = discussionsId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
