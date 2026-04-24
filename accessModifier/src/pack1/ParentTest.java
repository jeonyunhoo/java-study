package pack1;

public class ParentTest {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		System.out.println("=== 같은 패키지 테스트 ===");
		System.out.println("public a = " + p.a);
		System.out.println("proected b = " + p.b);
		System.out.println("default c = " + p.c);
		//System.out.println("privae d = " + p.d); //private 는 허용하지 않는 이상 다른 class 에서 이용할 수 없다
		
		System.out.println("\n ===메서드 호출===");
		p.show();
	}
}
