package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Recipe;

public interface RecipeRepo extends JpaRepository <Recipe, Integer> {

	List<Recipe> findByDietLabelId(int id);
	Recipe findByLabel(String label);
	List<Recipe> findByRecipeId(List<Integer> recipeId);

}
