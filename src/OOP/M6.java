package OOP;

class M6 extends Vehicle {
	M6 (final String color, final Producer producer, final Engine engine) {
		this.color = color;
		this.producer = producer.getCopyOfProducer();
		this.engine = engine.getCopyOfEngine();
	}
	
	@Override
	Producer getProducer() {
		return this.producer.getCopyOfProducer();
	}
}

