package OOP;

public abstract class Vehicle {
	private final String color;
	private final Producer producer;
	private final Engine engine;
	
	public Vehicle (String color, Producer producer, Engine engine) {
		this.color = color;
		this.producer = producer.getCopyOfProducer();
		this.engine = engine.getCopyOfEngine();
	}
	
}
