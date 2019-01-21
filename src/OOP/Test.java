package OOP;

public class Test {
	Vehicle vehicle;
	int rpm;
	double efficiencyValue;
	
	Test(Vehicle vehicle, int rpm, double efficiencyValue) {
		this.vehicle = vehicle;
		this.rpm=rpm;
		this.efficiencyValue = efficiencyValue;
						
	}
	double CO2Test(Vehicle vehicle, int rpm, double efficiencyValue) {
		return vehicle.getEngine().getCO2On100km();
	}


	public static void main (String[] args) {
		Engine om653 = new Diesel(2000, 0.78);
		Vehicle testedCar = new M6("Red",  , om653);
		
		
	}
}