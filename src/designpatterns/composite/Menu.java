package designpatterns.composite;

import java.util.ArrayList;

public class Menu extends MenuComponent{
	
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
	
	public Menu(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent){
		menuComponent.add(menuComponent);
	}
	
	//TODO complete this
	

}
