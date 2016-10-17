package designpatterns.facade;

public class TheaterLights {
	
	private int percentageDim;
	
	public void on(){
		System.out.println("lights on ..");
	}
	
	public void off(){
		System.out.println("lights off ..");
	}
	
	public void dim(int dim){
		this.setPercentageDim(dim);
		System.out.println("dimming lights by "+ this.getPercentageDim() + " ..");
	}

	public int getPercentageDim() {
		return percentageDim;
	}

	public void setPercentageDim(int percentageDim) {
		this.percentageDim = percentageDim;
	}

}
