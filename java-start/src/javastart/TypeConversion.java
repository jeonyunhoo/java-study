package javastart;

public class TypeConversion {
	
	public static void main(String[] args) {
		
		byte b = 127; //1바이트 - -128 ~ 127
		int i = 100;
		
		System.out.println(b + i); //b가 int 타입으로 자동 변환
		//227
		System.out.println(10 / 4);
		//2
		System.out.println(10.0 / 4); //4가 4.0으로 자동 변환(실수 변환)
		//2.5
		System.out.println((byte)(b + i)); //1바이트는 8비트 -128 ~127 //4바이트는 1바이트 오버플로우 발생 -> 원치않은 답이 나옴
		//-29
		System.out.println((int)2.9 + 1.8); //소수이하 버림
		//4
		System.out.println((int)(2.9 + 1.8));
		//3.8
		System.out.println((int)2.9 + (int)1.8);
		//3
		System.out.println((double)10 / 4); //정수/정수 = 정수, 강제 형 변환 -> 실수 -> 2.5
		//2.5					10.0(실수) / 4(정수) -> 10.0 / 4.0 = 2.5
		int a = 10;
		double result = a + 3.5;
		System.out.println(result); //13.5
	}
}
