package designpatterns.factory;

public class PizzaTestDrive {
	
	public static void main(String[] args){
		PizzaStore nyStore = new NyPizzaStore();
		Pizza cheesePizza = nyStore.orderPizza("cheese");
		
		System.out.println("Ordered a " + cheesePizza.getName());
	}

}
