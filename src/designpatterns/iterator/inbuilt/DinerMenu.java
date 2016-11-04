package designpatterns.iterator.inbuilt;

import java.util.Iterator;

public class DinerMenu implements Menu{
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu(){
		
		menuItems = new MenuItem[MAX_ITEMS];
		addItems("Vegetarian BLT", "(Fakin') Bacon with lettuce and tomato on whole wheat", true, 2.99);
		addItems("BLT", "Bacon with lettuce and tomato on whole wheat", false, 2.99);
		addItems("Soup of the day", "Soup of the day, with the side of potato salad", false, 3.99);
		addItems("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);		
		
	}
	
	public void addItems(String name, String description, boolean vegetarian, double price){
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS){
			System.out.println("Sorry Menu is full! can't add item to your menu");
		}
		else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
		
	}
	
	@Override
	public Iterator<MenuItem> createIterator(){
		return new DinerMenuIterator(menuItems);
	}

}
