package designpatterns.command.remotecontrol;

import designpatterns.command.appliances.CeilingFan;
import designpatterns.command.appliances.GarageDoor;
import designpatterns.command.appliances.Light;
import designpatterns.command.appliances.Stereo;
import designpatterns.command.appliances.TV;
import designpatterns.command.commands.CeilingFanOffCommand;
import designpatterns.command.commands.CeilingFanHighCommand;
import designpatterns.command.commands.GarageDoorDownCommand;
import designpatterns.command.commands.GarageDoorUpCommand;
import designpatterns.command.commands.LightOffCommand;
import designpatterns.command.commands.LightOnCommand;
import designpatterns.command.commands.StereoOffWithCdCommand;
import designpatterns.command.commands.StereoOnWithCdCommand;

public class RemoteLoader {
	
	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		//lights commands
		LightOnCommand livingRoomLightsOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightsOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		//ceiling fan
		CeilingFanHighCommand ceilingFanOnHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		//garage door
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		//stereo
		StereoOnWithCdCommand stereoOnwithCd = new StereoOnWithCdCommand(stereo);
		StereoOffWithCdCommand stereoOffWithCd = new StereoOffWithCdCommand(stereo);
		
		//assign commands
		remoteControl.setCommands(0, livingRoomLightsOn, livingRoomLightsOff);
		remoteControl.setCommands(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommands(2, ceilingFanOnHigh, ceilingFanOff);
		remoteControl.setCommands(3, stereoOnwithCd, stereoOffWithCd);
		remoteControl.setCommands(4, garageDoorUp, garageDoorDown);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtomWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtomWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtomWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtomWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtomWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		
		//create macro command and assign to next location
		//Light light = new Light("Living Room");
		//TV tv = new TV("Livinf Room");
		
	}

}
