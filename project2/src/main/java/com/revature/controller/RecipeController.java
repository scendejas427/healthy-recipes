package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Recipe;
import com.revature.services.RecipeService;

@RestController
@RequestMapping("recipe")
public class RecipeController {

	@Autowired
	private RecipeService rs;

	// /recipe
	@PostMapping
	public int save(@RequestBody Recipe r) {
		return rs.save(r);
	}

	// /recipe/:id
	@GetMapping("{id}")
	public Recipe findById(@PathVariable int id) {
		return rs.findById(id);
	}

	// /recipe/:id
	@PostMapping("ids")
	public List<Recipe> findRecipesByIdArray(@RequestBody List<Integer> ids) {
		return rs.findByIds(ids);
	}

	// /recipe/:dietid
	@GetMapping("/diet/{id}")
	public List<Recipe> findByDietLabelId(@PathVariable int id) {
		return rs.findByDietLabelId(id);
	}


	// /name/:label
	@GetMapping("/name/{label}")
	public Recipe findByLabel(@PathVariable String label) {
		return rs.findByLabel(label);
	}

}
