package dev.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_")
@Table(name = "Message")
public class SuperMessage extends SuperEntity {
	
	protected String contenu;
	protected String like_;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getLike() {
		return like_;
	}
	public void setLike(String like) {
		this.like_ = like_;
	}
	public String getLike_() {
		return like_;
	}
	public void setLike_(String like_) {
		this.like_ = like_;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

	

}
