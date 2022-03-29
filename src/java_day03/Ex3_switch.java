package java_day03;

import java.util.Scanner;

public class Ex3_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("다음중 프로그래밍 언어가 아닌 것은?"
				+ "\n1. c언어\n2. 파이썬\n3. JAVA\n4. 셰익스피어");
		
		int choice = sc.nextInt();
		String result = "";
//		double number = 0;	// 실수는 switch문의 변수자리에 들어갈 수 없다. 
		
		
		switch(choice) {
		case 4:
			result = "정답입니다.";
			break;
		case 1:case 2:case 3:
			result = "오답입니다.";
			break;
		default:
			result = "잘못 입력했습니다.";
		}
		System.out.println(result);
	}
}
