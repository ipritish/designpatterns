package designpatterns.command.commands;

import designpatterns.command.appliances.GarageDoor;

public class GarageDoorDownCommand implements Command{

	GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		garageDoor.down();
		garageDoor.lightOff();		
	}
	@Override
	public void undo() {
		garageDoor.up();
		garageDoor.lightOff();
		
	}

}
