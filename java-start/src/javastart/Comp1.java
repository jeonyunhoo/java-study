package javastart;

public class Comp1 {

	public static void main(String[] args) {
		
		String str1 = "문자열1";
		String str2 = "문자열1";
		
		boolean res1 = str1.equals(str2);
		boolean res2 = "Hello".equals("Hello1");
		
		System.out.println(res1);
		System.out.println(res2);
		
		System.out.println(true &&true);
		System.out.println(true &&false);
		System.out.println(true ||true);
		System.out.println(true ||false);
		
		int k = 15;
		boolean res3 = (10 < k) && (20 > k);
		System.out.println(res3);
	}
}
