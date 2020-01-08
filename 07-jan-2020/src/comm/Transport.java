package comm;

public abstract class Transport {
	protected double distance;
	private double fuelEfficiency;
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getFuelEfficiency() {
		return fuelEfficiency;
	}
	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	@Override
	public String toString() {
		return "Transport [distance=" + distance + ", fuelEfficiency=" + fuelEfficiency + "]";
	}
	
	public abstract void calculateDistance(int startDist,int endDist);
	public abstract void calculateFuelEfficiency(int initFuel,int currFuel);

}
