package designpatterns.strategy;

public class MiniDuckSimulator {
	
	public static void main(String[] args){
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}

}
