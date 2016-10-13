package designpatterns.command.appliances;

public class CeilingFan {
	
	String location = "";
	
	public enum SPEED {HIGH,MEDIUM,LOW,OFF};
	SPEED speed;
	
	public CeilingFan(String loc){
		location = loc;
	}
	
	public void high(){
		speed = SPEED.HIGH;
		System.out.println(location + " fan is high");
	}
	
	public void medium(){
		speed = SPEED.MEDIUM;
		System.out.println(location + " fan is medium");
	}
	
	public void low(){
		speed = SPEED.LOW;
		System.out.println(location + " fan is low");
	}
	
	public void off(){
		speed = SPEED.OFF;
		System.out.println(location + " fan is off");
	}
	
	public SPEED getSpeed(){
		return speed;
	}

}
