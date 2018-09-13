package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.RecipeTable;
import com.revature.services.RecipeService;

@RestController
@RequestMapping("recipe")
public class RecipeController {
	
	@Autowired
	private RecipeService rs;
	
	// /recipe
		@PostMapping
		public int save(@RequestBody RecipeTable r) {
			return rs.save(r);
		}

}
