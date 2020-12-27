package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.dto.FournisseurDto;
import com.adaming.service.FournoussieurService;

@RestController
@RequestMapping("/fournisseur")
@CrossOrigin
public class FournisseurController {
	
	@Autowired
	private FournoussieurService service;
	
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<FournisseurDto> getAll()
	{
		return service.getAll();
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable(name="id") Long id)
	{
		service.remove(id);
	}
	
	
//	@RequestMapping(value="/getById/{id}", method=RequestMethod.GET)
//	public Produit getById(@PathVariable(name="id") int id)
//	{
//		return dao.getById(id);
//	}
	
	
	@RequestMapping(value="/createOrUpdate",method=RequestMethod.POST)
	public void createOrUpdate(@RequestBody FournisseurDto fournisseur)
	{
		 service.add(fournisseur);
	}

}
