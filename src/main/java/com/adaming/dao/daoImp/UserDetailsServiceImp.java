package com.adaming.dao.daoImp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.adaming.dao.UserDAO;
import com.adaming.entity.Usermanager;

@Service
public class UserDetailsServiceImp implements UserDetailsService{

	@Autowired
	UserDAO dao;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usermanager u = dao.findByUserName(username);
		if(u == null) throw new UsernameNotFoundException(username);
		List<GrantedAuthority> list_role = u.getRoles()
				.stream()
				.map(role->new SimpleGrantedAuthority(role.getRole_Name()))
				.collect(Collectors.toList());
		
		return (UserDetails) new User(u.getLogin(), u.getPassword(), list_role);
	}
}
