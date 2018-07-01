package com.domino.api.recipe;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.domino.api.dataObjects.Ratings;
import com.domino.api.dataObjects.Recipe;
import com.domino.api.services.RecipeService;

@RestController
public class RecipeController {
	@Autowired
	private RecipeService recipeService;
	@RequestMapping("/recipes")
	public List<Recipe> getAllRecipes() {
		return recipeService.getAllRecipes();
	}
	@RequestMapping("/recipes/{id}")
	public Recipe getRecipe(@PathVariable String id) {
		return recipeService.getRecipe(id);
	}
	@RequestMapping(method = RequestMethod.POST, value="/recipes")
	public Recipe addRecipe(@RequestBody Recipe recipe) {
		recipe.setRatings(new Ratings());
		 return recipeService.addRecipe(recipe);
	}
	@RequestMapping(method = RequestMethod.PUT, value="/recipes/{id}")
	public void addRecipe(@RequestBody Recipe recipe, @PathVariable String id) {
		 recipeService.update(recipe, id);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/recipes/{id}")
	public void delete( @PathVariable String id) {
		recipeService.delete(id);
		
	}
}
