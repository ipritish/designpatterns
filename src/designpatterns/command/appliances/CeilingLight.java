package designpatterns.command.appliances;

public class CeilingLight {
	
	String location = "";
	
	public void on(){
		System.out.println(location + " light on");
	}
	
	public void off(){
		System.out.println(location + " light off");
	}
	
	public void dim(){
		System.out.println(location + " dim the lights");
	}

}
