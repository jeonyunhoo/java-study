package javastart;

import java.util.Scanner; //Scanner 클래스 사용
//import 는 ctrl + shift + o
public class ConvhentType {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //키보드 입력(객체 생성)
		//문자열 입력 //import필수
		System.out.print("숫자를 문자로 입력하세요: ");
		String a = sc.nextLine(); //nextLine() 은 문자열 1줄
		//문자를 숫자로 변환
		int num1 = Integer.parseInt(a); //a(문자) -> num(정수)
		//Integer(정수): Wrapper class(래퍼 클래스)
		//Wrapper class: 기본형을 객체로 감싸는 클래스
		//Interger.parseInt(a): 문자 -> 정수 변환
		
		//숫자 -> 문자 변환
		String str1 = Integer.toString(num1); //toString(문자로 변환)
		//기본형을 객체로 감싸는 클래스 //toString앞에 타립 지정
		String str2 = String.valueOf(num1); //valueOf(문자로 변환)
		//valueOf 타입 관계 없음
		
		//출력
		System.out.println(a);
		System.out.println(num1);
		System.out.println("toString " + str1);
		System.out.println("valueOf " + str2);
		
		sc.close();
	}
}
