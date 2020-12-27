package com.adaming.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class ProduitDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private long id;
	
	
	private String nom;

	private int quantite;
	

	private long prix;

	public long getPrix() {
		return prix;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}

	public ProduitDto() {
		super();
	}

	public ProduitDto(int id, String nom, int quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.quantite = quantite;
	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", quantite=" + quantite + "]";
	}
	
	
	
	
	
	
	

}
