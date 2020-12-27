package com.adaming.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class AssocieDto {


	private long id;
	
	private String nom;
	
	private String prenom;
	
	private String telephone;
	
	private String email;
	

	private AdresseDto adresse;
	
	private List<CheptelDto> listChemptel;

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getEmail() {
		return email;
	}	

	public void setId(long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public List<CheptelDto> getListChemptel() {
		return listChemptel;
	}

	public void setListChemptel(List<CheptelDto> listChemptel) {
		this.listChemptel = listChemptel;
	}
}
