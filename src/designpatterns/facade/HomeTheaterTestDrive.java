package designpatterns.facade;

public class HomeTheaterTestDrive {
	
	public static void main(String[] args){
		//instantiate all components and use facade
		Amplifier amp = new Amplifier();
		CDPlayer cd = new CDPlayer();
		DvdPlayer dvd = new DvdPlayer();
		PopcornPopper popper = new PopcornPopper();
		Projector projector = new Projector();
		Screen screen = new Screen();
		TheaterLights lights = new TheaterLights();
		Tuner tuner = new Tuner();
		
		HomeTheaterFacade theater = new HomeTheaterFacade(amp, tuner, dvd, cd, 
				                                          projector, screen, 
				                                          lights, popper);
		theater.watchMovies("Raidern of the Lost Ark");
		theater.endMovie();
	}

}
