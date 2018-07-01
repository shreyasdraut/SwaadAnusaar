package com.domino.api.dataObjects;


public class Ratings  {
	double rating;
	double ratingCount;
	double bestRating;
	double worstRating;
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public double getRatingCount() {
		return ratingCount;
	}
	public void setRatingCount(double ratingCount) {
		this.ratingCount = ratingCount;
	}
	public double getBestRating() {
		return bestRating;
	}
	public void setBestRating(double bestRating) {
		this.bestRating = bestRating;
	}
	public double getWorstRating() {
		return worstRating;
	}
	public void setWorstRating(double worstRating) {
		this.worstRating = worstRating;
	}
	public Ratings(){
		
		this.rating = 0;
		this.ratingCount = 0;
		this.bestRating = 0;
		this.worstRating = 0;
	}
	public Ratings(double rating,	double ratingCount,	double bestRating,	double worstRating) {
		this.rating = rating;
		this.ratingCount = ratingCount;
		this.bestRating = bestRating;
		this.worstRating = worstRating;
	}
	
	public String toString() {
		return String.format(
               "rating="+ rating+"\n"+
               "ratingCount"+ratingCount+"\n"+
               "bestRating"+bestRating+"\n"+
               "worstRating"+worstRating);
	}
	

}
