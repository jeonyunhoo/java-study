package javaex;

public class Excption02 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			
			System.out.println("연산을 시작합니다.");
			
			int result = a/b;
			
			System.out.println("결과는: " + result);
		} catch (ArithmeticException e) {
			
			System.out.println("존재하지 않는 값입니다.(0으로 나눌 수 없습니다)");
			System.out.println("메시지: " + e.getMessage());
		}
		
		System.out.println("프로그램 종료");
	}
}
