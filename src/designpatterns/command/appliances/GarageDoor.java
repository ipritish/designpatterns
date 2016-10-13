package designpatterns.command.appliances;

public class GarageDoor {
	
	String location;
	public GarageDoor(String loc) {
		this.location = loc;
	}
	public void up(){
		System.out.println("open garage door ..");
	}
	
	public void down(){
		System.out.println("close garage door ..");
	}
	
	public void stop(){
		System.out.println("stop movement");
	}
	
	public void lightOn(){
		System.out.println("garage lights on");
	}
	
	public void lightOff(){
		System.out.println("garage light off");
	}

}
