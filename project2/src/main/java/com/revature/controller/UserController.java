package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Users;
import com.revature.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService us;

	// /users
	@GetMapping
	public List<Users> findAll() {
		System.out.println("finding all users");
		return us.findAll();
	}

	// /users/:id
	@GetMapping("{id}")
	public Users findById(@PathVariable int id) {
		return null;
				//new users(id, "kjarmon", "pass", "admin", new ArrayList<>());
	}

//	@PostMapping
//	public ResponseEntity<users> save(@RequestBody users u) {
//		u.setId(1);
//		ResponseEntity<users> re = new ResponseEntity<users>(u, HttpStatus.CREATED);
//		return re;
//	}

}
