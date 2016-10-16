package designpatterns.facade;

public class Tuner {
	
private Amplifier amplifier;
	
	private double frequency;
	
	public void on(){
		System.out.println("cd player on ..");
	}

	public void off(){
		System.out.println("cd player off ..");
	}
	
	public void setAm(){
		System.out.println("setting in AM");
	}
	
	public void setFm(){
		System.out.println("setting in FM");
	}
	
	public void setFrequency(double frequency){
		this.frequency = frequency;
	}
	
	public double getFrequency(){
		return this.frequency;
	}
	
	public Amplifier getAmplifier() {
		return amplifier;
	}

	public void setAmplifier(Amplifier amplifier) {
		this.amplifier = amplifier;
	}

}
