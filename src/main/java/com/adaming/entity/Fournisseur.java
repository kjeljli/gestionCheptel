package com.adaming.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Fournisseur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String libelle;
	
	private String telephone;
	
	private String email;
	
	@ManyToOne
	@JoinColumn(name="ID_ADRESSE")
	private Adresse adresse;

	public long getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getEmail() {
		return email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
