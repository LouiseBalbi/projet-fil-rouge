package dev.entity;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SuperEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected LocalDate dateAjout;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the dateAjout
	 */
	public LocalDate getDateAjout() {
		return dateAjout;
	}
	/**
	 * @param dateAjout the dateAjout to set
	 */
	public void setDateAjout(LocalDate dateAjout) {
		this.dateAjout = dateAjout;
	}
	
	

}
