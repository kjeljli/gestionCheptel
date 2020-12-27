package com.adaming.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String rue;
	
	private String pays;
	
	private String ville;
	
	private int codePostale;

	public long getId() {
		return id;
	}

	public String getRue() {
		return rue;
	}

	public String getPays() {
		return pays;
	}

	public String getVille() {
		return ville;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

}
