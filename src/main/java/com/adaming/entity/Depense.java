package com.adaming.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Depense {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "QUANTITE")
	private int quantite;
	
	@Column(name = "PRIX")
	private long prix;
	
	@ManyToOne
	private TypeDepense type;
	
	LocalDate dateDepense;
	
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

	public TypeDepense getType() {
		return type;
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

	public void setType(TypeDepense type) {
		this.type = type;
	}

	

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateDepense() {
		return dateDepense;
	}

	public void setDateDepense(LocalDate dateDepense) {
		this.dateDepense = dateDepense;
	}
}
