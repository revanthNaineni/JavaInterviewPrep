package oOPS;

class Animal{
	public Animal getAnimal() {
		return new Animal();
	}
}

class Dog extends Animal{
	@Override
	public Dog getAnimal() {
		return new Dog();
	}
	
	void bark() {
        System.out.println("Woof!");
    }
}

public class Covariant {

	public static void main(String[] args) {
		Animal animal=new Dog();
		Dog dog=(Dog) animal;
		Dog returnedDog = dog.getAnimal();
        returnedDog.bark();
	}

}
