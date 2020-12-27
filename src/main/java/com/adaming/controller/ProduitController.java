package com.adaming.controller;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.dao.ProduitDAO;
import com.adaming.entity.Produit;

@RestController
@RequestMapping("/produit")
public class ProduitController {
	
	
	@Autowired
	ProduitDAO dao;
	
	
	
	@RequestMapping(value="/CPU", method=RequestMethod.GET)
	public void CPU_INFORMATION() {
	
	      System.out.println("CPU cores: " + Runtime.getRuntime().availableProcessors());
	      System.out.println("Free memory: " + Runtime.getRuntime().freeMemory());
	      System.out.println("Free memory: " + Runtime.getRuntime().totalMemory());
	      System.out.println("Max memory: " + Runtime.getRuntime().maxMemory());

}
	
	
	
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Produit> getAll()
	{
		return dao.getAll();
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable(name="id") int id)
	{
		dao.delete(id);
	}
	
	
	@RequestMapping(value="/getById/{id}", method=RequestMethod.GET)
	public Produit getById(@PathVariable(name="id") int id)
	{
		return dao.getById(id);
	}
	
	
	@RequestMapping(value="/createOrUpdate",method=RequestMethod.POST)
	public Produit createOrUpdate(@RequestBody Produit p)
	{
		return dao.create(p);
	}
	
	

}
