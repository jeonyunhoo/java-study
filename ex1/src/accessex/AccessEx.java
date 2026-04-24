package accessex;

class Sample {
	
	public int a;
	private int b;
	int c;
	
	void itprint() {
		
		System.out.println("public a: " + a);
		System.out.println("private b: " + b);
		System.out.println("c: " + c);
	}
}

public class AccessEx {

	public static void main(String[] args) {
		
		Sample sample = new Sample();
		sample.a = 10;
		sample.b = 10; //private 는 같은 클레스 안에서만 이요 가능, 상속 받아야만 사용 가능
		sample.c = 10;
		
		sample.itprint();
	}
}
