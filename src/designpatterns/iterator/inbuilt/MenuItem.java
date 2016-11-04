package designpatterns.iterator.inbuilt;

public class MenuItem {
	String name;
	String description;
	boolean vegearian;
	double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price){
		this.name = name;
		this.description = description;
		this.vegearian = vegetarian;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double getPrice(){
		return price;
	}
	
	public boolean isVegetarian(){
		return vegearian;
	}

}
