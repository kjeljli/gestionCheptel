package com.adaming.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Saison {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	private LocalDate dateDebut;
	
	
	private LocalDate dateFin;
	
	
	private boolean cloture;
	
	@ManyToOne
	@JoinColumn(name="ID_CHEPTEL")
	private Cheptel cheptel;
	

	public long getId() {
		return id;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public boolean isCloture() {
		return cloture;
	}

	public Cheptel getCheptel() {
		return cheptel;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public void setCloture(boolean cloture) {
		this.cloture = cloture;
	}

	public void setCheptel(Cheptel cheptel) {
		this.cheptel = cheptel;
	}
	
	

}
