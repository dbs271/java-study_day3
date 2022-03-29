package java_day03;

import java.util.Scanner;

public class Ex6_ForTask {
	public static void main(String[] args) {
		/*
			1~100 까지 출력하기 
			100~1 까지 출력하기 
			1~100 까지 중 짝수만 출력하 
			1~10 까지 합 출력하기 
			1~100 까지 홀수 합 출력하기 
			0 1 2 3 4 0 1 2 3 4 0 1 2 3 4 출력하기 
			
			정수하나 입력 받아서 1부터 입력받은 정수까지 출력하기 
			A~F 까지 출력 
			A~F 중 E 제외하고 출력
			aBcDeFg...Z 출력
		*/
		// 되도록이면 for문의 초기식은 int i = 0;
		// 증감식은 i++ 로 고정해놓고 연습
		
		System.out.println("1~100까지 출력하기");
		for(int i=0; i<100; i++) {
//			System.out.println(i+1);
		}
		
		System.out.println("100~1까지 출력하기");
		for(int i=100; i>0; i--) {
//			System.out.println(i);
		}

		System.out.println("1~100까지 중 짝수만 출력하기");
		for(int i=1; i<101; i++) {
			if(i%2 == 0) {
//			System.out.println(i);
			}
		}
		
		System.out.println("1~10까지 합 출력하기");
		int total = 0;
		for(int i=0; i<10; i++) {
			total += i+1;	// total = total + i + 1
		}
//		System.out.println(total);
		
		
		System.out.println("1~100까지 홀수 합 출력하기");
		int result = 0;
		for(int i=0; i<100; i++) {	// 1~99
			if(i % 2 == 1) {
				result += i;
//				System.out.println(i);
			}
		}
//		System.out.println(result);
		
		System.out.println("0 1 2 3 4 0 1 2 3 4 0 1 2 3 4 출력하기");
		for(int i=0; i<15; i++) {
//			System.out.print(i % 5 + " ");
		}
		
//		System.out.println("정수하나 입력 받아서 1부터 입력받은 정수까지 출력하기 ");
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			System.out.println(i+1);
//		}
		
		System.out.println("A~F까지 출력하기");
		// 정수 > 아스키코드 사용
		// 65-A, 66-B, 67-C, 68-D, 69-E, 70-F
		for(int i=0; i<6; i++) {	// i= 0~5 > 6번 반복 
//			System.out.println((char)(i + 65));
		}
		
		System.out.println("A~F 중 E 제외하고 출력");
		// 65-A, 66-B, 67-C, 68-D, 69-E, 70-F
		for(int i=0; i<6; i++) {
			if(i == 4) {
				i ++; 	// i =5
			}
//			System.out.println((char)(i + 65));
		}
		
		for(int i=0; i<5; i++) {
//			System.out.println((char)(i > 3? i + 66 : i +65));
		}
		
		System.out.println("aBcDeFg...Z 출력");
		// 짝수일 때 소문자(97~), 홀수일 때 대문자(65~)
		for(int i=0; i<26; i++) {	// i = 0~25
			System.out.print((char)(i % 2==0? i+97 : i+65));
			//	조건식의 결과가 true일 경우 소문자를 출력 / false일 경우 대분자를 출력
			//	true일 때 a c e g ... / false일 때 B D F ....
		}
		
	}
}
