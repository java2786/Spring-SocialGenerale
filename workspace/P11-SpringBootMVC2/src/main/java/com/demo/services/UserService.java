package com.demo.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.User;
import com.demo.repositories.UserRepository;

@Service
@Transactional
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
		
		User foundUser = findById(user.getEmail());
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
	
	public User findById(String email) {
		return userRepository.findById(email).orElse(null);
	}

	public void removeAccount(String email) {
//		userRepository.deleteById(email);
		userRepository.delete(findById(email));
	}
	
	public User edit(User user) {
		return userRepository.save(user);
	}
}
