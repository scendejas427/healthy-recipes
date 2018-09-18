package com.revature.services;

import java.util.List;

import javax.persistence.Table;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Recipe;
import com.revature.model.RecipeIngredients;
import com.revature.repos.RecipeIngredientsRepo;
import com.revature.repos.RecipeRepo;


@Service
@Table(name = "recipe_table")
public class RecipeService {
	
	@Autowired
	private RecipeRepo rr;
	@Autowired
	private RecipeIngredientsRepo rir;
	

	public Recipe save(Recipe newRecipe) {
		return rr.save(newRecipe);
	}
	
	public List<Recipe> findAll() {
		return rr.findAll();
	}

	public Recipe findById(int id) {
		return rr.findById(id).get();
	}
	
	public List<Recipe> findByDietLabelId(int id) {
		return rr.findByDietLabelId(id);
	}
	
	public List<Recipe> findByIds(List<Integer> ids) {
		return rr.findAllById(ids);
	}
	
	public Recipe findByLabel(String label) {
		return rr.findByLabel(label);
	}

	@Transactional
	public RecipeIngredients addItem(int id, RecipeIngredients newIngredient) {
		Recipe r = rr.getOne(id);
		RecipeIngredients ingredient = rir.getOne(newIngredient.getRecipeIngredientId());
		ingredient.setRecipe(r);
		rir.save(ingredient);
		return ingredient;
	}
	

}
