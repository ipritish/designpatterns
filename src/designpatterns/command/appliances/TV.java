package designpatterns.command.appliances;

public class TV {
	
	String location;
	int vol;
	int channel;
	
	public TV(String loc) {
		this.location = loc;
	}
	
	public void on(){
		System.out.println(location + " TV on");
	}
	
	public void off(){
		System.out.println(location + " TV off");
	}
	
	public void setVolume(int vol){
		this.vol = vol;
	}
	
	public void setInputChannel(int channel){
		this.channel = channel;
	}

}
