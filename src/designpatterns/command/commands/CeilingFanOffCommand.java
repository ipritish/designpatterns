package designpatterns.command.commands;

import designpatterns.command.appliances.CeilingFan;
import designpatterns.command.appliances.CeilingFan.SPEED;

public class CeilingFanOffCommand implements Command {

	CeilingFan ceilingFan;
	SPEED prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
		
	}
	
	@Override
	public void undo() {

		if(prevSpeed == SPEED.HIGH){
			ceilingFan.high();
		}
		else if(prevSpeed == SPEED.MEDIUM){
			ceilingFan.medium();
		}
		else if(prevSpeed == SPEED.LOW){
			ceilingFan.low();
		}
		else if(prevSpeed == SPEED.OFF){
			ceilingFan.off();
			
		}
		
	}

}
