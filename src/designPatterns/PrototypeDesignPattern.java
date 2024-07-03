package designPatterns;

interface Prototype {
	Prototype clone();
}

// Concrete prototype class
class ConcretePrototype implements Prototype {
	private int value;

	public ConcretePrototype(int value) {
		this.value = value;
	}

	@Override
	public Prototype clone() {
		return this;
	}

	public int getValue() {
		return value;
	}
}

// Client code
public class PrototypeDesignPattern {
	public static void main(String[] args) {
		ConcretePrototype prototype = new ConcretePrototype(10);
		ConcretePrototype copy = (ConcretePrototype) prototype.clone();

		System.out.println("Original: " + prototype.getValue());
		System.out.println("Copy: " + copy.getValue());
	}
}
