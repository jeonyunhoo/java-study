package javastart;

public class Var2 {

	public static void main(String[] args) {
		
		final double PA = 3.14;
		double res = PA * 10;
		
		System.out.println(res);
		//var : 자동 변수형 인식, 초기값이 없다면 사용하지 못한다.
		int x = 5;
		System.out.println(x++ + ++x);
		//'x++'는 후위 연산자이기에 5가 입력된 상태로 넘어간다. 
		//이후 '++x'는 전위 연산자이며 이전 x의 후위연산자에서 '++'를 이용하였으므로 6이 된 채로 전위연산자까지
		//1을 추가하여 7이 되어 더하여진다 즉 5 + 7 = 12
		System.out.println(2*1500 + 1500 + " Hello");
		
		var k = 30.5;
		var y = 12.3f;
		
		var n = "Java";
		
		System.out.println(x + " " +  k +  " " + y + " " + n);
	}
}