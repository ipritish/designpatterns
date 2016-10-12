package designpatterns.command;

public class GarageDoor {
	
	public void on(){
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
