package designpatterns.command;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("no command");
		
	}

}
