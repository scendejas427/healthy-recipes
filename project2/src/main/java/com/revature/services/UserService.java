package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Users;
import com.revature.repos.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo ur;
	
	public List<Users> findAll() {
		return ur.findAll();
	}
}
