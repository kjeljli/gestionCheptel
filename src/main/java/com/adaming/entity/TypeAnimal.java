package com.adaming.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeAnimal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="animal_type_id")
	private long id;
	
	private String libelle;

	public long getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
