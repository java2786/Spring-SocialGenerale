package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.User;

//@Repository
//public class UserRepository {
//	save(user){
//		make connection with db
//		run insert query
//		return result
//	}
//}


public interface UserRepository extends CrudRepository<User, String>{}

