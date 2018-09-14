package com.revature.services;

import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Recipe;
import com.revature.repos.RecipeRepo;


@Service
@Table(name = "recipe_table")
public class RecipeService {
	
	@Autowired
	private RecipeRepo rr;

	public int save(Recipe r) {
		return rr.saveAndFlush(r).getRecipeId();
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
	

}
