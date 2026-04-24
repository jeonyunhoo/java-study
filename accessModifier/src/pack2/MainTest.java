package pack2;

import pack1.Parent; //public 클래스는 어디서나 객체 생성가능, 하지만 패키지가 다를 경우 import 가 필요하다

public class MainTest {

	public static void main(String[] args) {
		
		Parent pa = new Parent();
		Child ch = new Child();
		
		System.out.println("===일반 객체 접근===");
		
		System.out.println("public a = " + pa.a);
		//System.out.println("proected b = " + pa.b); //protected 로 정의됨, 상속받지 못함
		//System.out.println("default c = " + pa.c); //default 로 정의됨
		//System.out.println("privae d = " + pa.d); //private 로 정의됨
		//자식 클래스 접근
		ch.printChild();
	}
}
