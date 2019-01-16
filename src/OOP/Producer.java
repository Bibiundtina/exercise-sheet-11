package OOP;

final class Producer {
	private final String name;
	
	Producer(String name) {
		this.name = name;
	}
	
	// ist die Auslagerung der Kopie so richtig?
	Producer getCopyOfProducer() {
		Producer producer = new Producer(this.name);
		return producer;
	}
}

// Klasse private machen und getCopyOfProducer package private
// 