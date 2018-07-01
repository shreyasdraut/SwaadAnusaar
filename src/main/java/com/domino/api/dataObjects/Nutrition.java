package com.domino.api.dataObjects;

public class Nutrition {

	
	String servingSize;
	String calories;
	String fatContent;
	String carbohydrateContent;
	String cholesterolContent;
	String fiberContent;
	String proteinContent;
	String saturatedFatContent;
	String sodiumContent;
	String sugarContent;
	String transFatContent;
	public String toString() {
		return String.format(
               "servingSize="+ servingSize+"\n"+
               "calories"+calories+"\n"+
               "fatContent"+fatContent+"\n"+
               "carbohydrateContent"+carbohydrateContent+"\n"+
               "cholesterolContent"+cholesterolContent+"\n"+
               "fiberContent"+fiberContent+"\n"+
               "proteinContent"+proteinContent+"\n"+
               "servingSize"+servingSize+"\n"+
               "saturatedFatContent"+saturatedFatContent+"\n"+
               "sodiumContent"+sodiumContent+"\n"+
               "sugarContent"+sugarContent+"\n"+
               "transFatContent"+transFatContent
				);
	}
	
	
	public String getServingSize() {
		return servingSize;
	}


	public void setServingSize(String servingSize) {
		this.servingSize = servingSize;
	}


	public String getCalories() {
		return calories;
	}


	public void setCalories(String calories) {
		this.calories = calories;
	}


	public String getFatcontent() {
		return fatContent;
	}


	public void setFatcontent(String fatcontent) {
		this.fatContent = fatcontent;
	}


	public String getCarbohydrateContent() {
		return carbohydrateContent;
	}


	public void setCarbohydrateContent(String carbohydrateContent) {
		this.carbohydrateContent = carbohydrateContent;
	}


	public String getCholesterolContent() {
		return cholesterolContent;
	}


	public void setCholesterolContent(String cholesterolContent) {
		this.cholesterolContent = cholesterolContent;
	}


	public String getFiberContent() {
		return fiberContent;
	}


	public void setFiberContent(String fiberContent) {
		this.fiberContent = fiberContent;
	}


	public String getProteinContent() {
		return proteinContent;
	}


	public void setProteinContent(String proteinContent) {
		this.proteinContent = proteinContent;
	}


	public String getSaturatedFatContent() {
		return saturatedFatContent;
	}


	public void setSaturatedFatContent(String saturatedFatContent) {
		this.saturatedFatContent = saturatedFatContent;
	}


	public String getSodiumContent() {
		return sodiumContent;
	}


	public void setSodiumContent(String sodiumContent) {
		this.sodiumContent = sodiumContent;
	}


	public String getSugarContent() {
		return sugarContent;
	}


	public void setSugarContent(String sugarContent) {
		this.sugarContent = sugarContent;
	}


	public String getTransFatContent() {
		return transFatContent;
	}


	public void setTransFatContent(String transFatContent) {
		this.transFatContent = transFatContent;
	}



	
	public Nutrition() {}
	
	
	public Nutrition(String servingSize,
	String calories,
	String fatcontent,
	String carbohydrateContent,
	String cholesterolContent,
	String fiberContent,
	String proteinContent,
	String saturatedFatContent,
	String sodiumContent,
	String sugarContent,
	String transFatContent) {
		this.calories = calories;
		this.fatContent = fatcontent;
		this.carbohydrateContent = carbohydrateContent;
		this.cholesterolContent = cholesterolContent;
		this.fiberContent = fiberContent;
		this.proteinContent = proteinContent;
		this.saturatedFatContent = saturatedFatContent;
		this.sodiumContent= sodiumContent;
		this.sugarContent = sugarContent;
		this.transFatContent = transFatContent;
		
	}



	
	
}
