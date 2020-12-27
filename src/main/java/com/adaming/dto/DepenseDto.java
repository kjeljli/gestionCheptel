package com.adaming.dto;

import java.time.LocalDate;


public class DepenseDto {



	private long id;
	

	private int quantite;
	

	private long prix;
	

	private TypeDepenseDto type;
	
	LocalDate date;
	
	private String description;

	public long getId() {
		return id;
	}

	public int getQuantite() {
		return quantite;
	}

	public long getPrix() {
		return prix;
	}

	public TypeDepenseDto getType() {
		return type;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}

	public void setType(TypeDepenseDto type) {
		this.type = type;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
