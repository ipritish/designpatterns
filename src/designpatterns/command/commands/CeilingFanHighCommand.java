package designpatterns.command.commands;

import designpatterns.command.appliances.CeilingFan;
import designpatterns.command.appliances.CeilingFan.SPEED;

public class CeilingFanHighCommand implements Command {

	CeilingFan ceilingFan;
	SPEED prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
		
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
