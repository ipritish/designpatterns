package designpatterns.command.commands;

import designpatterns.command.appliances.Hottub;

public class HottubOffCommand implements Command{

	Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	@Override
	public void execute() {
		hottub.jetsOff();
		hottub.drain();
		hottub.setHeaterOff();		
	}

	@Override
	public void undo() {
		hottub.jetsOn();
		hottub.setTemperature(70);
		hottub.circulate();
		
	}
	

}
