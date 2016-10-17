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
		
		System.out.println("Get ready to watch the movie ..");
		popper.on();
		popper.pop();
		
		lights.dim(10);
		
		screen.down();
		
		projector.on();
		projector.setInput(dvd);
		projector.wideScreenMode();
		
		amp.on();
		amp.setDvdPlayer(dvd);
		amp.setSurroundSound();
		amp.setVolume(10);
		
		dvd.on();
		dvd.play(movie);
		
	}
	
	public void endMovie(){
		
		System.out.println("Shutting movie theater down ..");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}

}
