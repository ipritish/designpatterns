package designpatterns.facade;

public class DvdPlayer {
	
	private Amplifier amplifier;
	private String movie;
	
	
	public Amplifier getAmplifier() {
		return amplifier;
	}

	public void setAmplifier(Amplifier amplifier) {
		this.amplifier = amplifier;
	}
	
	public void on(){
		System.out.println("switching dvd player on ..");
	}
	
	public void off(){
		System.out.println("switching dvd player off");
	}
	
	public void eject(){
		System.out.println("eject the dvd");
	}
	
	public void pause(){
		
	}
	
	public void play(String movie){
		this.setMovie(movie);
		System.out.println("watching "+ this.getMovie() + " ..");
	}
	
	public void setSurroundAudio(){
		
	}
	
	public void setTwoChannelAudio(){
		
	}
	
	public void stop(){
		System.out.println("stop the dvd ..");
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}


}
