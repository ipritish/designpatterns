package designpatterns.facade;

public class Projector {

	private DvdPlayer dvdPlayer;

	public DvdPlayer getDvdPlayer() {
		return dvdPlayer;
	}

	public void setDvdPlayer(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}
	
	public void on(){
		System.out.println("projector on .. ");
	}
	
	public void off(){
		System.out.println("projector off ..");
	}
	
	public void tvMode(){
		System.out.println("set tv mode .. ");
	}
	
	public void setInput(DvdPlayer dvd){
		this.setDvdPlayer(dvd);
	}
	
	public void wideScreenMode(){
		System.out.println("set wide screen mode .. ");
	}
	
}
