package designpatterns.observer.custom;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	
	private Subject weatherData;
	private float temp;
	private float humidity;
	
	public CurrentConditionDisplay(Subject s) {
		
		this.weatherData = s;
		weatherData.registerObserver(this);
		
	}

	@Override
	public void display() {
		System.out.println("Current Condition : " + temp + "F degrees and " 
                + humidity + "% humidity");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();		
		
	}

}
