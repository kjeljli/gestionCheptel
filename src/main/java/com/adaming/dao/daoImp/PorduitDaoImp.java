package com.adaming.dao.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.dao.ProduitDAO;
import com.adaming.entity.Produit;
import com.adaming.repository.ProduitRepository;

@Service
public class PorduitDaoImp implements ProduitDAO {
	
	@Autowired
	ProduitRepository repo;

	@Override
	public Produit create(Produit p) {
		return repo.save(p);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Produit getById(long id) {
		return repo.getOne(id);
	}

	@Override
	public List<Produit> getAll() {
		return repo.findAll();
	}

}
