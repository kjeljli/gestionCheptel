package com.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adaming.entity.Usermanager;

@Repository
public interface UserRepository extends JpaRepository<Usermanager, Long>{
	
	@Query("from Usermanager where login=:x and password=:y")
	public Usermanager authenticate(@Param("x")String username,@Param("y") String password);

	@Query("from Usermanager where login=:x")
	public Usermanager findByUsername(@Param("x") String username);

}
