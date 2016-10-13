package designpatterns.command.commands;

import designpatterns.command.appliances.CeilingFan;
import designpatterns.command.appliances.CeilingFan.SPEED;

public class CeilingFanLowCommand implements Command{
	
	CeilingFan ceilingFan;
	SPEED prevSpeed;
	
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.low();
		prevSpeed = ceilingFan.getSpeed();
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
