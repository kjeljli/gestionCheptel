package com.adaming.dao.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.dao.UserDAO;
import com.adaming.entity.Usermanager;
import com.adaming.repository.UserRepository;

@Service
public class UserDaoImp implements UserDAO{
	
	@Autowired
	UserRepository userRepo;
	

	@Override
	public Usermanager loadUserByUsername(String username , String password) {
		return userRepo.authenticate(username, password);
	}


	@Override
	public Usermanager findByUserName(String username) {
		
		return userRepo.findByUsername(username);
	}

}
