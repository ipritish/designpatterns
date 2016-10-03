package designpatterns.observer.inbuilt;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	
	private Observable observable;
	private float temp;
	private float humidity;
	
	public CurrentConditionDisplay(Observable s) {
		
		this.observable = s;
		observable.addObserver(this);
		
	}

	@Override
	public void display() {
		System.out.println("Current Condition : " + temp + "F degrees and " 
                + humidity + "% humidity");
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData)o;
			this.temp = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
		
	}

}
