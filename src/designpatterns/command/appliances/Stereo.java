package designpatterns.command.appliances;

public class Stereo {
	
	String location = "";
	int volume = 0;
	
	public Stereo(String loc) {
		this.location = loc;
	}
	
	public void on(){
		System.out.println(location + " stereo on");
	}
	
	public void off(){
		System.out.println(location + " stereo off");
	}
	
	public void setCd(){
		System.out.println(location + " is set for cd");
	}
	
	public void setDvd(){
		System.out.println(location + " is set for dvd");
	}
	
	public void setRadio(){
		System.out.println(location + " is set for radio");
	}
	
	public void setVolume(int vol){
		this.volume = vol;
		System.out.println("Stereo volume set to " + vol);
	}

}
