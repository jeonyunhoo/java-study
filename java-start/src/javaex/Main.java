package javaex;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee("홍길동", 201, 3500000);
		
		e.print();
		e.setName("이순신");
		e.setNo(205);
		e.setPay(5000000);
		System.out.println("수정 정보");
		e.print();
	}
}
