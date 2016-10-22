package designpatterns.template;

public class Coffee extends CaffeineBeverage {
	
	@Override
	public void brew() {
		System.out.println("Dripping Coffee through coffee");
	}
	
	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

}
