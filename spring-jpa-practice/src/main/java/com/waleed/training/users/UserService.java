package com.waleed.training.users;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	Iterable<User> getAllUsers(){
		return repo.findAll();
	}
	
	Optional<User> getUserById(int id){
		return repo.findById(id);
	}
	
	void addUser(User user) {
		repo.save(user);
	}
	
	void updateUser(User user) {
		repo.save(user);
	}
	
	void deleteUser(int id) {
		repo.deleteById(id);
	}

}
