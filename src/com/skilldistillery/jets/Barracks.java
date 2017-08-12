package com.skilldistillery.jets;

public class Barracks {
	Pilot[] pilots;

	public Barracks() {
		pilots = new Pilot[5];
		// TODO Auto-generated constructor stub
	}

	public Pilot[] getPilots() {
		return pilots;
	}

	public void setPilots(Pilot[] pilots) {
		this.pilots = pilots;
	}

	public Barracks(Pilot[] pilots) {
		super();
		this.pilots = pilots;
	}
	
}
