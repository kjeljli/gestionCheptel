package com.adaming.service;

import java.util.List;

import com.adaming.dto.FournisseurDto;

public interface FournoussieurService {

	void add(FournisseurDto fournisseur);
	
	void remove(Long id);
	
	List<FournisseurDto> getAll();
}
