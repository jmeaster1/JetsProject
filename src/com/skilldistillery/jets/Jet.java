package com.skilldistillery.jets;

public class Jet {
	String model;
	Double speed, range;
	int capacity;
	
	Pilot pilot;

	public Jet() {
		// TODO Auto-generated constructor stub
	}

	public Jet(String model, Double speed, Double range, int capacity, Pilot pilot) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.capacity = capacity;
		this.pilot = pilot;
	}
	
	public Double convertToMach() {
		Double machSpeed = (speed/767.269148);
		return machSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Double getRange() {
		return range;
	}

	public void setRange(Double range) {
		this.range = range;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", capacity=" + capacity + ", pilot="
				+ pilot + "]";
	}

	

}
