package javastart;

import java.util.Scanner;

class StudentP {
	
	String name;
	int score;
	
	StudentP(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
}

public class StudentScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수는 몇 명인가요?: ");
		int cnt = sc.nextInt();
		sc.nextLine();
		
		StudentP [] stu = new StudentP[cnt];
		//배열 객체 생성
		//반복문을 이용하여 배열 요소 객체 생성
		//값을 키보드로 입력받음
		for(int i = 0; i < stu.length; i++) {
			
			System.out.print((i + 1) + "학생 이름: ");
			String name = sc.nextLine();
			
			System.out.print((i + 1) + "학생 점수: ");
			int score = sc.nextInt();
			sc.nextLine();
			
			System.out.println(" ");
			
			stu[i] = new StudentP(name, score);
		}
		//이름 검색
		while(true) {
			
			int a = 1;
			
			System.out.print("검색할 학생 이름: ");
			String sname = sc.nextLine();
			
			if(sname.equals("그만")) {
				break; //while //break는 가장 가까운 반복문을 1회 탈출한다.
			}
			
			//boolean is = false;
			
			for(int k = 0; k < stu.length; k++) {
				
				if(sname.equals(stu[k].name)) {
					
					System.out.println(sname + "의 점수는 " + stu[k].score + "점");
					
					//is = true;
					a -= 1;
					
					break;	//for
				} //if
			} //for
			
			if(a == 0) {
				
				System.out.println("찾지 못했습니다.");
			}
		}
		
		sc.close();
		System.out.println(" ");
		System.out.println("프로그램을 종료합니다");
	}
}
