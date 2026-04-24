package ex2;

public class Dog2 extends Animal2 {

	@Override
	public void sound() {
		
		System.out.println("강아지가 멍멍 짖습니다");
	}

	@Override
	public void move() {
		
		System.out.println("강아지가 네 발로 걷습니다.");
	}
}
