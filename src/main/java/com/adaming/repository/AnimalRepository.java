package com.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

}
