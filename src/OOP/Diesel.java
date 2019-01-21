package OOP;

class Diesel extends Engine {
	
			
	
	Diesel (int rpm, double efficiencyValue) {
		this.rpm = rpm;
		this.efficiencyValue = efficiencyValue;
		this.COEFFICIENT = CO2_COEFFICIENT_DIESEL;
	}

	@Override
	Engine getCopyOfEngine() {
		// TODO Auto-generated method stub
		return null;
	}
}
