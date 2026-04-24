package ex3;
//자식 클래스
public class Dog3 extends Animal3 {

	String breed;
	
	Dog3(String name, int age, String breed) {
		
		super(name, age);
		this.breed = breed;
	}
	
	public void showDog() {
		
		show();
		System.out.println("품종: " + breed);
	}
}
