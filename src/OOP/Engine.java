package OOP;

final class Engine {
	private final String type;
	private final int rpm;
	private final int efficiencyValue;
	
	Engine (String type, int rpm, int efficiencyValue) {
		this.type = type;
		this.rpm = rpm;
		this.efficiencyValue = efficiencyValue;
	}
	
	final Engine makeCopyOfEngine() {
		Engine engine = new Engine(this.type, this.rpm, this.efficiencyValue);
		return engine;
	}
}
