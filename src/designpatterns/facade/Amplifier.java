package designpatterns.facade;

public class Amplifier {
	
	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CDPlayer cdPlayer;
	private int volume;
	
	public Tuner getTuner() {
		return tuner;
	}
	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}
	public DvdPlayer getDvdPlayer() {
		return dvdPlayer;
	}
	public void setDvdPlayer(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}
	public CDPlayer getCdPlayer() {
		return cdPlayer;
	}
	public void setCdPlayer(CDPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}
	
	public void on(){
		
	}
	
	public void off(){
		
	}
	
	public void setStereoSound(){
		System.out.println("setting stereo sound .. ");
	}
	
	public void setSurroundSound(){
		System.out.println("setting surround sound ..");
	}
	
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("setting volume to " + volume);
	}
	
	

}
