package com.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entity.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
