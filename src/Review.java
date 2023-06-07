import java.io.*;
import javax.swing.JTextArea;
import java.lang.*;
import java.util.*;
public class Review implements Serializable{
	protected String name;
	protected String description;
        protected String game;
	protected double graphics;
	protected double gameplay;
	protected double performance;
	protected double audio;

        public void printReview(JTextArea area){
            area.append("\nName: " + name + "\n");
            area.append(description + "\n");
            area.append("Overall Rating: " + String.valueOf(this.getRating()) + " Graphics: " + String.valueOf(this.getGraphics()) + " Gameplay: " + String.valueOf(this.getGameplay()) +"\nPerformance: " + String.valueOf(this.getPerformance()) + " Audio: " + String.valueOf(this.getAudio()) );
            area.append("\n----------------------------------------------");
        }
        public void printReview2(JTextArea area){
            
            area.append("\nName: " + name + "\n");
            area.append("Game: " + (this.getGame()) + "\n");
            area.append(description + "\n");
            area.append("Overall Rating: " + String.valueOf(this.getRating()) + " Graphics: " + String.valueOf(this.getGraphics()) + " Gameplay: " + String.valueOf(this.getGameplay()) +"\nPerformance: " + String.valueOf(this.getPerformance()) + " Audio: " + String.valueOf(this.getAudio()) );
            area.append("\n-------------------------------------------------");
        }
       
	public void setReview(String name, String description, String game, double graphics, double gameplay, double performance, double audio) {
		this.name = name;
		this.description = description;
                this.game = game;
		this.graphics= graphics;
		this.gameplay = gameplay;
		this.performance = performance;
		this.audio = audio;
	}
	
        public String getGame(){
            String game = this.game;
            return game;
        }
	public String getName() {
		String name = this.name;
		return name;
	}
        public void changeName(String name){
            this.name = name;
        }
	
	public String getDescription() {
		String description = this.description;
		return description;
	}
	
	public double getRating() {
		double rating = ((this.graphics + this.gameplay + this.performance + this.audio) / 4);
		return rating;
	}
	
	public double getGraphics() {
		double graphics = this.graphics;
		return graphics;
	}
	
	public double getGameplay() {
		double gameplay = this.gameplay;
		return gameplay;
	}
	
	public double getPerformance() {
		double performance = this.performance;
		return performance;
	}
	
	public double getAudio() {
		double audio = this.audio;
		return audio;
	}
}
