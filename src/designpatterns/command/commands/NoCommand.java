package designpatterns.command.commands;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("no command");
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
