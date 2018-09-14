package com.revature.services;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Ingredients;
import com.revature.repos.IngredientRepo;

@Service
@Table(name = "ingredients")
public class IngredientService {
	
	@Autowired
	private IngredientRepo ir;
	
	public Ingredients findByIngredients(String ingredients) {
		return ir.findByIngredients(ingredients);
	}

}
