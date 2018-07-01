package com.domino.api.dbseeder;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.domino.api.dataObjects.Nutrition;
import com.domino.api.dataObjects.Ratings;
import com.domino.api.dataObjects.Recipe;
import com.domino.api.repositories.RecipeRepository;
@Component
public class RecipeSedeer implements CommandLineRunner{
	
	RecipeRepository recipeRepository;
	public RecipeSedeer(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository ;	
	}
	@Override
	public void run(String... args) throws Exception {
		Recipe vadpav = new Recipe("vadaPav", "Shreyas", new ArrayList<>(), "", new Ratings(), "20mins", "20 mins", 
				4, new Nutrition(), new ArrayList<>(), new ArrayList<>());
				
		
	}
	
}
