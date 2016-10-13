package designpatterns.command.commands;

import designpatterns.command.appliances.GarageDoor;

public class GarageDoorUpCommand implements Command{

	GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor; 
	}
	@Override
	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();
		
	}
	@Override
	public void undo() {
		garageDoor.down();
		garageDoor.lightOff();
		
	}

}
