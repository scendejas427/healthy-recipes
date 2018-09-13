package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.RecipeTable;

public interface RecipeRepo extends JpaRepository <RecipeTable, Integer> {

}
