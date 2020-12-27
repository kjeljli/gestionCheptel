package com.adaming.dto;

public class AnimalDto {
	

	private long id;
	
	
	private TypeAnimalDto type;
	

	private CheptelDto cheptel;
	
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

	private String nom ;

	public TypeAnimalDto getType() {
		return type;
	}

	public CheptelDto getCheptel() {
		return cheptel;
	}

	public void setType(TypeAnimalDto type) {
		this.type = type;
	}

	public void setCheptel(CheptelDto cheptel) {
		this.cheptel = cheptel;
	}

}
