package oOPS;

class Engine{
	
	public String model;
	public Engine(String model) {
		this.model=model;
	}
	
}

class Car{
	public Engine engine;
	public String color;
	
	public Car(String color) {
		this.color=color;
		this.engine=new Engine("4 stroke");
	}
}

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car= new Car("blue");
		System.out.println(car.color);
		System.out.println(car.engine.model);
		

	}

}
