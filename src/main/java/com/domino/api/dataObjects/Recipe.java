package com.domino.api.dataObjects;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "recipe")
public class Recipe {
	@Id
	String id;
	String name;
	String Author;
	List<String> images;
	String description;
	Ratings ratings;
	String prepTime;
	String totalTime;
	double servingSize;
	Nutrition nutritionalValue;
	List<String> ingredients;
	List<String> instructions;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Ratings getRatings() {
		return ratings;
	}
	public void setRatings(Ratings ratings) {
		this.ratings = ratings;
	}
	public String getPrepTime() {
		return prepTime;
	}
	public void setPrepTime(String prepTime) {
		this.prepTime = prepTime;
	}
	public String getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
	public double getServingSize() {
		return servingSize;
	}
	public void setServingSize(double servingSize) {
		this.servingSize = servingSize;
	}
	public Nutrition getNutritionalValue() {
		return nutritionalValue;
	}
	public void setNutritionalValue(Nutrition nutritionalValue) {
		this.nutritionalValue = nutritionalValue;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public List<String> getInstructions() {
		return instructions;
	}
	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}
	public Recipe() {
		// TODO Auto-generated constructor stub
	}
	public Recipe(
	String name,
	String Author,
	List<String> images,
	String description,
	Ratings ratings,
	String prepTime,
	String totalTime,
	double servingSize,
	Nutrition nutritionalValue,
	List<String> ingredients,
	List<String> instructions
	) {
	
		this.name  = name;
		this.Author = Author;
		this.images = images;
		this.description = description;
		this.ratings = ratings;
		this.prepTime = prepTime;
		this.totalTime = totalTime;
		this.servingSize = servingSize;
		this.nutritionalValue = nutritionalValue;
		this.ingredients = ingredients;
		this.instructions = instructions;
		
		
		
	}
	@Override
	public String toString() {
		return String.format(
               "name="+ name+"\n"+
               "Author"+Author+"\n"+
               "images"+images+"\n"+
               "description"+description+"\n"+
               "ratings"+ratings+"\n"+
               "prepTime"+prepTime+"\n"+
               "totalTime"+totalTime+"\n"+
               "servingSize"+servingSize+"\n"+
               "nutritionalValue"+nutritionalValue+"\n"+
               "ingredients"+ingredients+"\n"+
               "instructions"+instructions
				);
	}
	
}
