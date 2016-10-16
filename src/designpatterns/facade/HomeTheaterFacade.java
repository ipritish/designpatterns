package designpatterns.facade;

public class HomeTheaterFacade {
	
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CDPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CDPlayer cd,
							 Projector projector, Screen screen, TheaterLights lights, 
							 PopcornPopper popper) {
		
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
		
	}
	
	public void watchMovies(String movie){
		
	}
	
	public void endMovie(){
		
	}

}
