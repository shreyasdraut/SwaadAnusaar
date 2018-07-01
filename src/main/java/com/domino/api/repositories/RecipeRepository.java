package com.domino.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.domino.api.dataObjects.Recipe;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String>{

}
