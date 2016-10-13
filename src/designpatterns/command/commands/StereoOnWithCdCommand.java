package designpatterns.command.commands;

import designpatterns.command.appliances.Stereo;

public class StereoOnWithCdCommand implements Command{

	Stereo stereo;
	
	public StereoOnWithCdCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
		
	}
	@Override
	public void undo() {
		stereo.off();
		
	}

}
