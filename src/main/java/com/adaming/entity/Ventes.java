package com.adaming.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Ventes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_VENTE")
	private long id;
	
	@OneToOne
	private Animal animal;
	
	private long prixVente;
	
	private long partProprio;
	
	private long partAssocie;
	
	private long amortissementCharge ;
	
	
	private LocalDate dateVente;

	public long getId() {
		return id;
	}

	public Animal getAnimal() {
		return animal;
	}

	public long getPrixVente() {
		return prixVente;
	}

	public long getPartProprio() {
		return partProprio;
	}

	public long getPartAssocie() {
		return partAssocie;
	}

	public long getAmortissementCharge() {
		return amortissementCharge;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void setPrixVente(long prixVente) {
		this.prixVente = prixVente;
	}

	public void setPartProprio(long partProprio) {
		this.partProprio = partProprio;
	}

	public void setPartAssocie(long partAssocie) {
		this.partAssocie = partAssocie;
	}

	public void setAmortissementCharge(long amortissementCharge) {
		this.amortissementCharge = amortissementCharge;
	}

	public LocalDate getDateVente() {
		return dateVente;
	}

	public void setDateVente(LocalDate dateVente) {
		this.dateVente = dateVente;
	}

}
