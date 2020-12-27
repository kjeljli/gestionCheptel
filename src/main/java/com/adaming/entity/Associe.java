package com.adaming.entity;

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

@Entity
public class Associe {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_ASSOCIE")
	private long id;
	
	private String nom;
	
	private String prenom;
	
	private String telephone;
	
	private String email;
	
	private long pourcentage;
	
	@ManyToOne
	@JoinColumn(name="ID_ADRESSE")
	private Adresse adresse;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="associe")	
	private List<Cheptel> listChemptel;

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


	public List<Cheptel> getListChemptel() {
		return listChemptel;
	}

	public void setListChemptel(List<Cheptel> listChemptel) {
		this.listChemptel = listChemptel;
	}

	public long getPourcentage() {
		return pourcentage;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setPourcentage(long pourcentage) {
		this.pourcentage = pourcentage;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}
