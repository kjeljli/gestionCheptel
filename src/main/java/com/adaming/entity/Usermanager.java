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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="USERMANAGER")
public class Usermanager {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	
	private String login;
	private String password;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.DETACH )
	@JoinTable(name="user_role", joinColumns=@JoinColumn(name="user_id",referencedColumnName="id"), 
	inverseJoinColumns=@JoinColumn(name="role_id",referencedColumnName="id_role"))
	List<Role> roles;

	public Usermanager(long id, String login, String password, List<Role> roles) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.roles = roles;
	}

	public Usermanager() {
		super();
	}

	public Usermanager(String login, String password, List<Role> roles) {
		super();
		this.login = login;
		this.password = password;
		this.roles = roles;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Usermanager [id=" + id + ", login=" + login + ", password=" + password + ", roles=" + roles + "]";
	}
	
	
	

}
