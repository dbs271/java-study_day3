package java_day03;

import java.util.Scanner;

public class Ex2_ifTask {
	public static void main(String[] args) {
		// 사용자에게 번호(1,2,3,4 번 중 택1)를 입력받은 후
		// 해당 번호가 정답이라면 "정답입니다." 출력, 오답이라면 "오답입니다." 출력
		// 그외의 번호를 입력했다면 "잘못 입력하셨습니다." 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("다음중 프로그래밍 언어가 아닌 것은?"
				+ "\n1. c언어\n2. 파이썬\n3. JAVA\n4. 셰익스피어");
		int num = sc.nextInt();
		if(num == 4) {
			System.out.println("정답입니다.");
		}else if(num == 1 || num == 2 || num == 3) {
			System.out.println("오답입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}
}
