package OOP;

abstract class Engine {
	int rpm;
	double efficiencyValue;
	static double CO2_COEFFICIENT_DIESEL = 2.64;
	static double CO2_COEFFICIENT_PETROL = 2.33;
	static double COEFFICIENT;
	
	abstract Engine getCopyOfEngine();
	
	double getGasOn100km() {
		return 3*this.rpm/(1000*this.efficiencyValue);
	}
	
	double getCO2On100km() {
		return this.getGasOn100km() * COEFFICIENT;
	}
	
		
}
				
