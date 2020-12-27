package com.adaming.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class CheptelDto {


	private long id;
	
	private String nom ;
	
	
    private AssocieDto associe;
	

	private AdresseDto adresse;
	

	private List<AnimalDto> animalsList;

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public AssocieDto getAssocie() {
		return associe;
	}

	public AdresseDto getAdresse() {
		return adresse;
	}

	public List<AnimalDto> getAnimalsList() {
		return animalsList;
	}

	public void setAssocie(AssocieDto associe) {
		this.associe = associe;
	}

	public void setAdresse(AdresseDto adresse) {
		this.adresse = adresse;
	}

	public void setAnimalsList(List<AnimalDto> animalsList) {
		this.animalsList = animalsList;
	}

	
	
	
}
