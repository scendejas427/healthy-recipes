package com.revature.services;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import javax.persistence.Table;

=======
>>>>>>> 78400c10d67ec00d0383311b7bdaf0a0a6b1fad7
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Users;
import com.revature.repos.UserRepo;

@Service
<<<<<<< HEAD
@Table(name = "users")
public class UserService {

	@Autowired
	private UserRepo ur;

	public List<Users> findAll() {
		return ur.findAll();
	}

	public Users findById(int id) {
		return ur.findById(id).get();
	}
	
	public Users findByUsername(String username) {
		return ur.findByUsername(username);
	}

	public Users findByUsernameAndPassword(String username, String password) {
		return ur.findByUsernameAndPassword(username, password);
	}
	
	public int save(Users u) {
		return ur.saveAndFlush(u).getUserId();
	}
=======
public class UserService {
	
	@Autowired
	private UserRepo ur;
	
	public List<Users> findAll() {
		return ur.findAll();
	}
>>>>>>> 78400c10d67ec00d0383311b7bdaf0a0a6b1fad7
}
