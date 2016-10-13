package designpatterns.command.appliances;

import java.util.Date;

public class GardenLight {
	
	private Date duskTime;
	private Date dawnTime;
	public void manualOn(){
		System.out.println("garden lights on");
	}
	
	public void manualOff(){
		System.out.println("garden lights off");
	}
	
	public void setDuskTime(Date date){
		this.duskTime = date;
	}
	
	public void setDawnTime(Date date){
		this.dawnTime = date;
	}
	
	public Date getDawntime(){
		return dawnTime;
	}
	
	public Date getDusktime(){
		return duskTime;
	}

}
