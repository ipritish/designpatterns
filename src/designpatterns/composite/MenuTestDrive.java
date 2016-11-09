package designpatterns.composite;

public class MenuTestDrive {
	
	public static void main(String[] args){
		
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");
		
		MenuComponent allMenu = new Menu("ALL MENUS","All menus combined");
		
		allMenu.add(pancakeHouseMenu);
		allMenu.add(dinerMenu);
		allMenu.add(cafeMenu);
		
		
		
		//add individual menu items
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
		pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
		pancakeHouseMenu.add(new MenuItem("Waffles","Waffles, with your choice of blueberries or strawberries", true, 3.99));
		
		dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce and tomato on whole wheat", true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce and tomato on whole wheat", false, 2.99));
		dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with the side of potato salad", false, 3.99));
		dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));
		
		//add sub menu
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie","Apple pie with falnky crust, topped with vanila ice cream",true,1.59));
		
		cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie Burger on whole wheat bun, lettuce, tomato and fries",
				true, 3.99));
		cafeMenu.add(new MenuItem("Soup of the day", "A cup of soup of the day, with the side dish",
				false, 3.69));
		cafeMenu.add(new MenuItem("Burrito","A large burrito, with whole pinto beans, salsa, guacamole", 
				true, 4.29));
		
		Waitress waitress = new Waitress(allMenu);
		waitress.printMenu();
		
		
		
	}

}
