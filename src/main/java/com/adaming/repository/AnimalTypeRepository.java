package com.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entity.TypeAnimal;

@Repository
public interface AnimalTypeRepository extends JpaRepository<TypeAnimal, Long>{

}
