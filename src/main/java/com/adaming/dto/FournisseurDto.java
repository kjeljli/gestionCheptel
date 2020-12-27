package com.adaming.dto;

public class FournisseurDto {
	
	
	private long id;
	
	private String libelle;
	
	private String telephone;
	
	private String email;
	

	private AdresseDto adresse;

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

	public AdresseDto getAdresse() {
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

	public void setAdresse(AdresseDto adresse) {
		this.adresse = adresse;
	}

}
