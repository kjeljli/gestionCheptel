package com.adaming.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_role")
	private long id;
	private String description;
	private String role_Name;
	
	
	public Role() {
		super();
	}


	public Role(String description, String role_Name) {
		super();
		this.description = description;
		this.role_Name = role_Name;
	}


	public Role(long id, String description, String role_Name) {
		super();
		this.id = id;
		this.description = description;
		this.role_Name = role_Name;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getRole_Name() {
		return role_Name;
	}


	public void setRole_Name(String role_Name) {
		this.role_Name = role_Name;
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", description=" + description + ", role_Name=" + role_Name + "]";
	}
	
	
	

}
