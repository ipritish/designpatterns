package designpatterns.command.commands;

import designpatterns.command.appliances.TV;

public class TVOffCommand implements Command {

	TV tv;
	
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.off();
		
	}

	@Override
	public void undo() {
		tv.on();
		tv.setInputChannel(2);
		tv.setVolume(10);
		
	}
	

}
