package designpatterns.state;

public class GumballMachine {
	
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	
	State state;
	private int count = 0;
	
	public GumballMachine(int numberGumballs){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		if(numberGumballs > 0){
			state = noQuarterState;
		}else{
			state = soldOutState;
		}
	}
	
	public int getCount(){
		return this.count;
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state){
		this.state = state;
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot ..");
		if(count != 0){
			count = count - 1;
		}
	}
	public State getSoldOutState() {
		return soldOutState;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}
	
	public String toString(){
		return "Mighty Gumball, Inc.\nInventory : " + getCount() + " gumballs\nMachine is waiting for quarters";
	}

}
