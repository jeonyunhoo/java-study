package pack2;

import pack1.Parent;

public class Child extends Parent { //Parent 클래스에서 상속

	public void printChild() {
		
		System.out.println("===자식 클래스 접근===");
		System.out.println("public a = " + a);
		System.out.println("protected b = " + b);
		//System.out.println("default c = " + c); 
		//System.out.println("private d = " + d);
	}
}
