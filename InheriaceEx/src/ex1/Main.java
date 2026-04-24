package ex1;

public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog(); //Animal 클래스의 Dog 클래스를 불러옴
		
		d.name = "나비"; //Dog 서브 클래스가 상속받은 Animal 슈퍼 클래스에 멤버 변수인 name, age, color 변수에 값을 담음
		d.age = 5;
		d.color = "갈색";
		
		System.out.println(d.name + ", "  + d.age + ", " + d.color);
		
		d.eat(); //슈퍼 클래스 
		//Dog 서브 클래스가 상속받은 Animal 슈퍼 클래스의 메서드를 불러옴
		d.sleep(); //슈퍼 "
		d.bark(); //서브 클래스
		d.run(); //서브 "
	}
}
