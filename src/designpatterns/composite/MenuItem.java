package designpatterns.composite;

public class MenuItem extends MenuComponent{
	
	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, boolean veg, double price){
		this.name = name;
		this.description = description;
		this.vegetarian = veg;
		this.price = price;
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	@Override
	public String getDescription(){
		return description;
	}
	
	@Override
	public double getPrice(){
		return price;
	}
	
	public boolean isVegetarian(){
		return vegetarian;
	}
	
	public void print(){
		System.out.print(" " + getName());
		if(isVegetarian()){
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("  -- " + getDescription());
	}

}
