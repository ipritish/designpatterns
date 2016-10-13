package designpatterns.command.appliances;

public class Light {
	
	String location = "";
	
	public Light(String loc){
		location = loc;
	}
	public void on(){
		System.out.println(location + " light on");
	}
	
	public void off(){
		System.out.println(location + " light off");
	}
	

}
