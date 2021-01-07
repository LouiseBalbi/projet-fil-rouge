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
	protected long id;
	protected LocalDate dateAjout;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
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
