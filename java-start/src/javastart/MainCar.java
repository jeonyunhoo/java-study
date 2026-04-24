package javastart;

class Car { 

	String model; 
	int speed;
	
	Car(String model, int speed) {
		
		this.model = model;
		this.speed = speed;
		//this: 매개변수와 맴버변수의 이름이 같을 때 두 변수의 저장 위치가 다름을 이를 때 사용함
	}
	
	Car(String model) {
		
		this.model = model;
		speed = 0;
	}
	
	void showPrint() {
		
		System.out.println("모델명: " + model + ", 속도: " + speed);
	}
}

public class MainCar { 

	public static void main(String[] args) { 
		
		Car c1 = new Car("Sonata", 100); 
		Car c2 = new Car("Avante", 80); 
		Car c3 = new Car("Genesis");

		c1.showPrint();
		c2.showPrint();
		c3.showPrint();
	}
}
