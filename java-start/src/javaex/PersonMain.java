package javaex;

class Person {
	
	private int age;

	public int getAge() { //get 값 반환
		return age;
	}

	public void setAge(int age) { //set 값 설정
		//나이가 1~100세 까지가 아니면 "나이 입력 오류(1~100 사이)
		if(age <= 100 && age >= 1) {
			
			this.age = age;
		} else {
			
			System.out.println("나이 입력 오류(1~100사이)");
		}
	}
	
}

public class PersonMain {

	public static void main(String[] args) {
		
		Person p = new Person();
		//p.age = 10; private 직접 접근 불가
		p.setAge(25);
		System.out.println("현재 나이: " + p.getAge());
	}
}
