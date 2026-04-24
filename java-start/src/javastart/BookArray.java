package javastart;

import java.util.Scanner;

class BookA {
	
	String title;
	int price;
	
	BookA(String title, int price) {
		
		this.title = title;
		this.price = price;
	}
}

public class BookArray {

	public static void main(String[] args) {
		
		BookA [] book =  new BookA[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < book.length; i++) {
			
			System.out.print("제목 입력: ");
			String title = sc.nextLine();
			
			System.out.print("가격 입력: ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.println("");
			
			book[i] = new BookA(title, price); //배열의 요소만큼 객체 생성
		}
		
		for(int j = 0; j < book.length; j++) {
			
			System.out.println("책 제목: " + book[j].title);
			System.out.println("책 가격: " + book[j].price);			
			System.out.println("");			
		}
		
		sc.close();
	}
}
