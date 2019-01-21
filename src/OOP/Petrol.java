package OOP;

class Petrol extends Engine {
	Petrol (int rpm, double efficiencyValue) {
		this.rpm = rpm;
		this.efficiencyValue = efficiencyValue;
		this.COEFFICIENT = CO2_COEFFICIENT_PETROL;
	}
	
	@Override
	Engine getCopyOfEngine() {
		// TODO Auto-generated method stub
		return this;
	}
	
}
