package com.revature.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	// /recipe/:id
	@GetMapping("{id}")
	public RecipeTable findById(@PathVariable int id) {
		return rs.findById(id);
	}

	// /recipe/:dietid
	@GetMapping("/diet/{id}")
	public List<RecipeTable> findByDietLabelId(@PathVariable int id) {
		return rs.findByDietLabelId(id);
	}
	
	// /recipe/:recipe i.e. find by url
	@GetMapping("/url/{url}")
	public RecipeTable findByRecipe(@PathVariable String url) {
		return rs.findByRecipe(url);
	}
	
	// /name/:label
	@GetMapping("/name/{label}")
	public RecipeTable findByLabel(@PathVariable String label) {
		return rs.findByLabel(label);
	}
	
	// /name/:label
	@GetMapping("/ingredients/{ingredients}")
	public List<RecipeTable> findByIngredients(@PathVariable List<String> ingredients) {
//		return rs.findByIngredients(ingredients);
		return null;
	}


}
