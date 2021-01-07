package dev.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("MESSAGE")
public class Message extends SuperMessage {
	
	
	

}
