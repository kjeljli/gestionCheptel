package com.adaming.dao;

import com.adaming.entity.Usermanager;

public interface UserDAO {
	
	public Usermanager loadUserByUsername(String username, String password);
	
	public Usermanager findByUserName(String username);

}
