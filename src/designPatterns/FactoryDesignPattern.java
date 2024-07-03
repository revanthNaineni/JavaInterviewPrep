package designPatterns;

//Product interface
interface Animal {
	void makeSound();
}

//Concrete Product: Dog
class Dog implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog barks!");
	}
}

//Concrete Product: Cat
class Cat implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat meows!");
	}
}

//Creator (Factory) interface
interface AnimalFactory {
	Animal createAnimal();//factory method
}

//Concrete Creator: Dog Factory
class DogFactory implements AnimalFactory {
	@Override
	public Animal createAnimal() {
		return new Dog();
	}
	
}

//Concrete Creator: Cat Factory
class CatFactory implements AnimalFactory {
	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}

public class FactoryDesignPattern{
	public static void main(String[] args) {
		AnimalFactory factory = new DogFactory();
		Animal dog = factory.createAnimal();
		dog.makeSound(); // Output: Dog barks!

		factory = new CatFactory();
		Animal cat = factory.createAnimal();
		cat.makeSound();
	}
}
