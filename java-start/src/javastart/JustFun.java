package javastart;

import java.util.Scanner;

public class JustFun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수를 문자로 입력하세요: ");
		String input = sc.nextLine();
		
		double d = Double.parseDouble(input);
		String str1 = Double.toString(d);
		String str2 = String.valueOf(d);
		
		System.out.println(input);
		System.out.println(d);
		System.out.println("toString " + str1);
		System.out.println("valueOf " + str2);
	}
}
