package com.revature.services;

import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.RecipeTable;
import com.revature.repos.RecipeRepo;


@Service
@Table(name = "recipe_table")
public class RecipeService {
	
	@Autowired
	private RecipeRepo rr;

	public int save(RecipeTable r) {
		return rr.saveAndFlush(r).getRecipeId();
	}

	public RecipeTable findById(int id) {
		return rr.findById(id).get();
	}
	public List<RecipeTable> findByDietLabelId(int id) {
		return rr.findByDietLabelId(id);
	}

	public RecipeTable findByRecipe(String url) {
		return rr.findByRecipe(url);
	}
	
	public RecipeTable findByLabel(String label) {
		return rr.findByLabel(label);
	}
	
	public RecipeTable findByIngredients(String ingredients) {
		return rr.findByIngredients(ingredients);
	}

}
