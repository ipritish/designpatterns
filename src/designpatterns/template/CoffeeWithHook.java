package designpatterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");		
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk");		
	}
	
	@Override
	boolean customerWantsCondiments() {
		
		String answer = getUserInput();
		return (answer.toLowerCase().startsWith("y"));

	}
	
	public String getUserInput() {
		String answer = null;
		System.out.print("Would you like sugar and milk with your coffee (y/n)? ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = reader.readLine();
		}
		catch(IOException ioe){
			System.out.println("IO error trying to red your input");
		}
		if(answer == null){
			answer = "no";
		}
		return answer;
	}

}
