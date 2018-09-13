package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Users;

@Repository
public interface UserRepo extends JpaRepository <Users, Integer> {
	
<<<<<<< HEAD
	Users findByUsername(String username);
	Users findByUsernameAndPassword(String username, String password);
	
=======
>>>>>>> 78400c10d67ec00d0383311b7bdaf0a0a6b1fad7
}