package designpatterns.composite;

import java.util.Iterator;

public class Waitress {
	
	MenuComponent allMenu;
	
	public Waitress(MenuComponent allMenu){
		this.allMenu = allMenu;
	}
	
	public void printMenu(){
		allMenu.print();
	}
	
	public void printVegetarianMenu(){
		Iterator<MenuComponent> iterator = allMenu.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		while(iterator.hasNext()){
			MenuComponent menuComponent = iterator.next();
			try{
				if(menuComponent.isVegetarian()){
					menuComponent.print();
				}
			}
			catch(UnsupportedOperationException upe){
				
			}
		}
	}

}
