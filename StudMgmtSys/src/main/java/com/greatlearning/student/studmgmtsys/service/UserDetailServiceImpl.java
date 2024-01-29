package com.greatlearning.student.studmgmtsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.student.studmgmtsys.entity.User;
import com.greatlearning.student.studmgmtsys.repository.UserRepository;
import com.greatlearning.student.studmgmtsys.security.StudUserDetails;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		User user = repository.findByName(name);
		
		if (user == null) {
			throw new UsernameNotFoundException(name + " is not present");
		}
		StudUserDetails userDetails = new StudUserDetails(user);
		return userDetails;
	}

}