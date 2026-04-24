package test;

class Book {
	
	String title;
	
	Book(String title) {
		
		this.title = title;
	}
	
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Book [] b = new Book[3];
		
		b[0] = new Book("노인과 바다");
		b[1] = new Book("구의 증명");
		b[2] = new Book("나니아 연대기");
		
		for(int i = 0; i < b.length; i++) {
			
			System.out.println(b[i].title);
		}
	}
}
