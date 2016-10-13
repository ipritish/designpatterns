package designpatterns.command.commands;

import designpatterns.command.appliances.Hottub;

public class HottubOnCommand implements Command {

	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	@Override
	public void execute() {
		hottub.jetsOn();
		hottub.setTemperature(70);
		hottub.circulate();
		
	}

	@Override
	public void undo() {
		hottub.jetsOff();
		hottub.drain();
		hottub.setHeaterOff();
		
	}
	
	

}
