package designpatterns.strategy;

public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck(){
		
	}
	
	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void swim(){
		System.out.println("All Ducks Float Even Decoys!");
	}
	
	public void setFlyBehaviour(FlyBehaviour fb){
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb){
		quackBehaviour = qb;
	}

}
