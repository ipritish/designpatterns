package designpatterns.command.commands;

import designpatterns.command.appliances.TV;

public class TVOnCommand implements Command{

	TV tv;
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}
	@Override
	public void execute() {
		tv.on();
		tv.setVolume(10);
		tv.setInputChannel(2);
		
	}

	@Override
	public void undo() {
		tv.off();		
	}
	
	

}
