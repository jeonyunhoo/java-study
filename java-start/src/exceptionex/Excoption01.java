package exceptionex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excoption01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		try {
			
			int n = sc.nextInt();
			
			if(n % 2 == 0) {
				
				System.out.println("짝수");
			} else {
				
				System.out.println("홀수");
			}
		} catch (InputMismatchException e) {
			//정수를 입력하지 않고 문자를 입력하여 예외 상황 발생
			System.out.println("잘못입력했습니다. 정수를 입력해 주세요.");
		}
		
		finally {
			
			System.out.println("프로그램 종료");
			sc.close();
		}
	}
}
	