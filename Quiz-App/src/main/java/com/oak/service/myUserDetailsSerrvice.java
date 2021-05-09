package com.oak.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.oak.Repository.UserRepository;
import com.oak.dto.Users;


public class myUserDetailsSerrvice implements UserDetailsService {

	@Autowired
	UserRepository userrepository;
	
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("hello");
	Optional<Users> user=userrepository.findByName(username);
	Users u = user.orElseThrow(() -> new UsernameNotFoundException("Error!"));

    return new myUserDetails(u);
	}

}
