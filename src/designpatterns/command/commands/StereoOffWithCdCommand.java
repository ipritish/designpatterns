package designpatterns.command.commands;

import designpatterns.command.appliances.Stereo;

public class StereoOffWithCdCommand implements Command{

	Stereo stereo;
	public StereoOffWithCdCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		stereo.off();		
	}
	@Override
	public void undo() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
		
	}

}
