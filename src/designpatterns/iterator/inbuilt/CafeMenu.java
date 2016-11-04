package designpatterns.iterator.inbuilt;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu{
	
	HashMap<String, MenuItem> menuItems = new HashMap<String,MenuItem>();
	
	public CafeMenu(){
		
		addItems("Veggie Burger and Air Fries", "Veggie Burger on whole wheat bun, lettuce, tomato and fries",
				true, 3.99);
		addItems("Soup of the day", "A cup of soup of the day, with the side dish",
				false, 3.69);
		addItems("Burrito","A large burrito, with whole pinto beans, salsa, guacamole", 
				true, 4.29);
		
		
	}
	
	public void addItems(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}

}
