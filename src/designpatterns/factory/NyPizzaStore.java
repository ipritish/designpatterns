package designpatterns.factory;

public class NyPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory nyPizzaIngredientFactory = new NyPizzaIngredientFactory();
		if(item.equals("cheese")){
			pizza = new CheesePizza(nyPizzaIngredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}
		return pizza;
	}
	

}
