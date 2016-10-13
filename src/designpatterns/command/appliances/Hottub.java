package designpatterns.command.appliances;

public class Hottub {
	
	double temperature;
	
	public void circulate(){
		System.out.println("circulate water");
	}
	
	public void jetsOn(){
		System.out.println("jets on");
	}
	
	public void jetsOff(){
		System.out.println("jets off");
	}
	
	public void drain(){
		System.out.println("darining tub");
	}
	
	public void setHeaterOff(){
		System.out.println("setting heater off");
	}
	
	public void setTemperature(double temp){
		this.temperature = temp;
	}

}
