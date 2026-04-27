package staticex;

//static 변수는 클래스가 메모리에 로딩될 때 생성
//모든 객체 공유
//바로 사용 가능
//한 번만 생성된(끝까지)

class Counter { // 새로운 클래스 생성
   int cnt = 0; // 일반 변수
   
   void increase() { // return값이 없는 메서드 생성
      cnt++; // 정수 변수 cnt 후위연산
   }
} //일반 변수는 객체마다 각각의 기억변수가 생성된다

public class StaticTest1 {

   public static void main(String[] args) {
      Counter c1 = new Counter(); // c1이라는 Counter 클래스의 객체 생성
      Counter c2 = new Counter(); // c2이라는 Counter 클래스의 객체 생성
      
      c1.increase(); // c1이라는 counter 클래스 안에있는 increase(); 메서드 불러오기
      c2.increase(); // c2이라는 counter 클래스 안에있는 increase(); 메서드 불러오기
      
      
      
      
      System.out.println("c1 : "+c1.cnt); // c1이라는 counter 클래스 안에있는 정수 cnt 값 출력
      System.out.println("c2 : "+c2.cnt); // c2라는 counter 클래스 안에있는 정수 cnt 값 출력
   

   }

}
