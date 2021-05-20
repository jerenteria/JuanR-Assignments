package com.juan.beltReview.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.beltReview.models.User;
import com.juan.beltReview.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public User find(Long id) {
		User user = this.uRepo.findById(id).orElse(null);
		return user;
	}
	public List<User> allUsers() {
		return this.uRepo.findAll();
	}
	
	// Register user
	public User registerUser(User user) {
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hash);
		return this.uRepo.save(user);
	}
	
	public boolean authenticateUser(String email, String password) {
		User user = this.uRepo.findByEmail(email);
		if(user == null) {
			return false;
		}
		return BCrypt.checkpw(password, user.getPassword());
	}
	public User getByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
	
	// create users
	public User createUser(User newUser) {
		return this.uRepo.save(newUser);
	}
	
	// get all users
	public List<User> getAllUsers() {
		return this.uRepo.findAll();
	}
	
	// get single users
	public User getSingleUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
}
