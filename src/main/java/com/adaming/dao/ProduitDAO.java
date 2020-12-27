package com.adaming.dao;

import java.util.List;

import com.adaming.entity.Produit;

public interface ProduitDAO {
	
	public Produit create(Produit p);
	public void delete(long id);
	public Produit getById(long id);
	public List<Produit> getAll();

}
