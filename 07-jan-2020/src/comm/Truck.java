package comm;

public class Truck extends Transport{

	@Override
	public void calculateDistance(int startDist, int endDist) {
		double distance=endDist-startDist;
		System.out.println(distance);
		
		
	}

	@Override
	public void calculateFuelEfficiency(int initFuel, int currFuel) {
		double fuelEfficiency=(currFuel-initFuel)/distance;
		System.out.println(fuelEfficiency);
	}
	
	public Truck(double distance,double fuelEfficiency) {
		setDistance(distance);
		setFuelEfficiency(fuelEfficiency);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
