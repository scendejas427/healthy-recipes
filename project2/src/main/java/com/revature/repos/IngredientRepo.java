package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Ingredients;

public interface IngredientRepo extends JpaRepository <Ingredients, Integer> {
	
	Ingredients findByIngredients(String ingredients);

}
