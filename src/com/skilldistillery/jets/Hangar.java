package com.skilldistillery.jets;

public class Hangar {
	Jet[] jets;
	
	
	
	

	public Hangar() {
		jets = new Jet[5];
		// TODO Auto-generated constructor stub
	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

	public Hangar(Jet[] jets) {
		super();
		this.jets = jets;
	}
	
}
