package com.domino.api.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domino.api.dataObjects.Recipe;
import com.domino.api.repositories.RecipeRepository;

@Service
public class RecipeService {
	@Autowired
	private RecipeRepository recipeRepository;
	private List<Recipe> recipes = new ArrayList<>();
	public RecipeService() {
		// TODO Auto-generated constructor stub
	}
	public RecipeService(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	public List<Recipe> getAllRecipes(){
		return this.recipeRepository.findAll();
	}
	public Recipe getRecipe(String id) {
		return this.recipeRepository.findOne(id);
	}
	
	public Recipe addRecipe(Recipe recipe) {
		try {
		this.recipeRepository.insert(recipe);
		return recipe;
		}
		catch(Exception e) {
			return new Recipe();
		}
	}
	public void update(Recipe recipe, String id) {
		this.recipeRepository.save(recipe);
//		for( int i =0;i<recipes.size();i++) {
//			Recipe recipeToUpdate = recipes.get(i);
//			if(recipeToUpdate.getId().equals(id)) {
//				recipes.set(i, recipe);
//				return;
//			}
//		}
//		
	}


	public void delete(String id) {
		this.recipeRepository.delete(id);
		//recipes.removeIf(r-> r.getId().equals(id));
		
	}
}
