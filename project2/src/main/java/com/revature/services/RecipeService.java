package com.revature.services;

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

}
