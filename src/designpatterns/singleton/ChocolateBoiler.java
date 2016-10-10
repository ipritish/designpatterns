package designpatterns.singleton;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	
	private volatile static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	//thread safe implementation
	public static ChocolateBoiler getInstance(){
		if(uniqueInstance == null){
			synchronized (ChocolateBoiler.class) {
				if(uniqueInstance == null){
					uniqueInstance = new ChocolateBoiler();
				}
			}			
		}
		return uniqueInstance;
	}
	
	public void fill(){
		if(!isEmpty()){
			empty = false;
			boiled = false;
		}
	}
	
	public void drain(){
		if(!isEmpty() && isBoiled()){
			empty = true;
		}
	}
	
	public void boil(){
		if(!isEmpty() && !isBoiled()){
			boiled = true;
		}
	}
	
	
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isBoiled(){
		return boiled;
	}

}
