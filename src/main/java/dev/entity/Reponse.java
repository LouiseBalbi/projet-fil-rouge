package dev.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("REPONSE")
public class Reponse extends SuperMessage {
	
}
