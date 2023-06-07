import java.io.*;
import java.util.*;

public class User implements Serializable {
	protected String username;
	protected String password;
	protected String favorite_genre;
	ArrayList<Review> user_reviews = new ArrayList<>();
	
	public static void main(String[] args) {
		

	}
	public Review getReview(int i){
            return user_reviews.get(i);
        }
	public void setUser(String username, String password, String genre) {
		this.username = username;
		this.password = password;
		this.favorite_genre = genre;
	}
	
	public String getUsername() {
		String username = this.username;
		return username;
	}

	public String getPassword() {
		String password = this.password;
		return password;
	}
	
	public String getFavoriteGenre() {
		String genre = this.favorite_genre;
		return genre;
	}
	
	public int getAmountReviews() {
		int number = user_reviews.size();
		return number;
	}
        
        public void changeUsername(String username){
            this.username = username;
        }
	
        
	public void addReview(Review review) {
		this.user_reviews.add(review);
	}
	
	public ArrayList<String> getRecommendation(ArrayList<Game> game_list) {
	    int amount = game_list.size();
	    ArrayList<String> recommendation_list = new ArrayList<>();
	    for(int i = 0; i < amount; i++) {
	    	if(this.favorite_genre == game_list.get(i).getGenre()) {
	    		recommendation_list.add(game_list.get(i).getName());
	    	}
	    }
	    return recommendation_list;
	}
}
