package javastart;

import java.util.Scanner;

public class ScannerEx2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격: ");
		int price = sc.nextInt();
		
		System.out.print("상품명: ");
		String pro = sc.nextLine();
		sc.nextLine(); //문자열 입력 -> 숫자 입력 -> 문제 없음
					   //숫자 -> 문자열 ->Enter 상쇄작업 필요
		System.out.print("수량: ");
		double quan = sc.nextDouble();
		
		System.out.print("회원여부(true/false): ");
		boolean mem = sc.nextBoolean();
		
		int tot = price * (int)quan;
		
		if(mem) {
			
			tot = (int)(tot * 0.9);
		}
		
		System.out.println("상품명: " + pro);
		System.out.println("가격: " + price);
		System.out.println("수량: " + quan);
		System.out.println("총액: " + tot);
		//System.out.println("회원여부: " + mem);
		
		if(mem) { //boolean이면 mem == true 
			
			System.out.println("회원입니다.");
			System.out.println("회원전용 10% 할인 적용");
		} else {
			
			System.out.println("비회원입니다.");
		}
		
		sc.close();
	}
}
