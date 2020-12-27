package com.adaming.entity;

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

@Entity
public class Cheptel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nom ;
	
	@ManyToOne
	@JoinColumn(name="ID_ASSOCIE")
    private Associe associe;
	
	@ManyToOne
	@JoinColumn(name="ID_ADRESSE")
	private Adresse adresse;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="cheptel")
	private List<Animal> animalsList;

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

	
	
	
}
