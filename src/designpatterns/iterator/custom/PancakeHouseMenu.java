package designpatterns.iterator.custom;

import java.util.ArrayList;

public class PancakeHouseMenu {
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
		
		menuItems = new ArrayList<MenuItem>();
		
		addItems("K&B's Pancake breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItems("Regular Pancake breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItems("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItems("Waffles","Waffles, with your choice of blueberries or strawberries", true, 3.99);
	}
	
	public void addItems(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}

}
