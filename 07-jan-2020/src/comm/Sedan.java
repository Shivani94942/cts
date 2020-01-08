package comm;

public class Sedan extends Car{
	
	private boolean isAcEnabled;

	@Override
	public void accelerateCar() {
		
		System.out.println("Sedan is moving....");
	}

	@Override
	public void breakCar() {
		
		System.out.println("Sedan is slowing down....");
	}
	

}
