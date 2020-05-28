package com.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.User;
import com.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		// dao/repo -> insert
		return userRepository.save(user);
	}

	public User getLogin(User user) {
//		Optional<User> optional = userRepository.findById(user.getEmail());
//		User user2 = optional.get();

		System.out.println("user before db data");
		System.out.println(user);
		
		User foundUser = userRepository.findById(user.getEmail()).orElse(null);
		System.out.println("db user");
		System.out.println(foundUser);
		
		if(foundUser!=null && user.getPassword().equals(foundUser.getPassword())) {
			System.out.println("valid user");
			return foundUser;
		} else {
			System.out.println("invalid user");
			return null;
		}
	}
}
