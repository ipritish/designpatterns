package designpatterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverage {
	
	@Override
	void brew() {
		System.out.println("Steeping the tea ");		
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");		
	}
	
	@Override
	boolean customerWantsCondiments() {
		
		String answer = getUserInput();
		return (answer.toLowerCase().startsWith("y"));

	}
	
	String getUserInput() {
		String answer = null;
		System.out.print("Would you like lemon with your tea (y/n)? ");
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
