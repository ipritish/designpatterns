package designpatterns.command.uselambda;

import designpatterns.command.appliances.CeilingFan;
import designpatterns.command.appliances.GarageDoor;
import designpatterns.command.appliances.Light;
import designpatterns.command.appliances.Stereo;

public class RemoteLoader {
	
	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		remoteControl.setCommands(0, livingRoomLight::on, livingRoomLight::off);
		remoteControl.setCommands(1, kitchenLight::on, kitchenLight::off);
		remoteControl.setCommands(2, ceilingFan::high, ceilingFan::off);
		
		Command stereoOnWithCD = () -> {stereo.on();stereo.setCd();stereo.setVolume(11);};
		remoteControl.setCommands(3, stereoOnWithCD, stereo::off);
		remoteControl.setCommands(4, garageDoor::up, garageDoor::down);
		
		
		System.out.println(remoteControl);
		
		remoteControl.onButtomWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtomWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtomWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtomWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtomWasPushed(4);
		remoteControl.offButtonWasPushed(4);
				
		
		
	}

}
