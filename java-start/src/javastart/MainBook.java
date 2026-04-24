package javastart;

class Book { 

	String title; 
	int price;
	
	Book(String n, int p) { //객체 생성시 인자 2개
		
		title = n;
		price = p;
	}
	
	Book(String n) { //객체 생성 시 인자 1개
		
		title = n;
		price = 0;
	}
	
	Book() { //객체 생성 시 인자 없음
		
		title = "c언어의 정석";
		price = 0;
	}
	void showPrice() {
		
		System.out.println("제목: " + title + ", 가격: " + price);
	}
}

public class MainBook { 

	public static void main(String[] args) { 
		
		Book mybook = new Book("자바의 정석", 20000); 
		Book mybook2 = new Book("파이썬의 정석");
		Book mybook3 = new Book();

//		mybook.title = "자바의 정석"; 
//		mybook.price = 20000;
		mybook.showPrice();
		mybook2.showPrice();
		mybook3.showPrice();
	}
}
