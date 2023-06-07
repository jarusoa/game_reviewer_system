import java.io.*;
import java.util.*;

public class Game implements Serializable{
	protected String name;
	protected String description;
	protected String genre;
	
	ArrayList<Review> review_list = new ArrayList<>();
	
	public static void main(String[] args) {
		
	}
	public Review getReview(int i){
            return review_list.get(i);
        }
	public void setGame(String name, String description, String genre) {
		this.name = name;
		this.description = description;
		this.genre = genre;
	}
       
	
	public String getName() {
		String name = this.name;
		return name;
	}
	
	public String getGenre() {
		String genre = this.genre;
		return genre;
	}
        
        public String getDescription(){
            String description = this.description;
            return description;
        }
        
        public void addReview(Review review){
            this.review_list.add(review);
        }
        
	public double getRating() {
		int amount = this.review_list.size();
		double rating;
		double number = 0;
		for(int i = 0; i < amount; i++) {
			number += review_list.get(i).getRating();
		} // end for loop
		rating = number / amount;
		return rating;
	} // end getRating
	
	public double getGraphics() {
		int amount = this.review_list.size();
		double rating;
		double number = 0;
		for(int i = 0; i < amount; i++) {
			number += review_list.get(i).getGraphics();
		} // end for loop
		rating = number / amount;
		return rating;
	} // end getGraphics
	
	public double getGameplay() {
		int amount = this.review_list.size();
		double rating;
		double number = 0;
		for(int i = 0; i < amount; i++) {
			number += review_list.get(i).getGameplay();
		} // end for loop
		rating = number / amount;
		return rating;
	} // end getGameplay
	
	public double getPerformance() {
		int amount = this.review_list.size();
		double rating;
		double number = 0;
		for(int i = 0; i < amount; i++) {
			number += review_list.get(i).getPerformance();
		} // end for loop
		rating = number / amount;
		return rating;
	} // end getPerformance
	
	public double getAudio() {
		int amount = this.review_list.size();
		double rating;
		double number = 0;
		for(int i = 0; i < amount; i++) {
			number += review_list.get(i).getAudio();
		} // end for loop
		rating = number / amount;
		return rating;
	} // end getAudio
	
} // end game
