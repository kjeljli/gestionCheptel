package com.adaming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.dto.FournisseurDto;
import com.adaming.entity.Fournisseur;
import com.adaming.repository.FournisseurRepository;
import com.adaming.service.FournoussieurService;

@Service
@Transactional
public class FournisseurServiceImpl implements FournoussieurService{

	@Autowired
	private FournisseurRepository fournisseurRepo;
	@Override
	public void add(FournisseurDto fournisseur) {
		
		Fournisseur f=new Fournisseur();
		f.setEmail(fournisseur.getEmail());
		f.setLibelle(fournisseur.getLibelle());
		f.setTelephone(fournisseur.getTelephone());
		fournisseurRepo.save(f);
		
	}

	@Override
	public void remove(Long id) {
		
	}

	@Override
	public List<FournisseurDto> getAll() {
		// TODO Auto-generated method stub
		//return fournisseurRepo.findAll();
		fournisseurRepo.findAll();
		return null;
	}

}
