package com.adaming.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Intervention {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_INTERVENTION")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="ID_ANIMAL")
	private Animal animal;
	
	private String description;

}
