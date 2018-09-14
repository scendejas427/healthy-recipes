package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.RecipeTable;

public interface RecipeRepo extends JpaRepository <RecipeTable, Integer> {

	List<RecipeTable> findByDietLabelId(int id);
	RecipeTable findByRecipe(String url);
	RecipeTable findByLabel(String label);
	RecipeTable findByIngredients(String ingredients);

}
