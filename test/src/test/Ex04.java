package test;

class Car {
	
	String model;
	int speed;
	
	Car(String model, int speed) {
		
		this.model = model;
		this.speed = speed;
	}
	
	void print() {
		
		System.out.println("모델명: " + model);
		System.out.println("속도: " + speed);
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		Car c1 = new Car("제네시스", 100);
		Car c2 = new Car("과학 5호기", 120);
		                                                
		c1.print();
		c2.print();
	}
}
