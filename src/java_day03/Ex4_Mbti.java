package java_day03;

import java.util.Scanner;

public class Ex4_Mbti {
	public static void main(String[] args) {
		// 사용자에게 MBTI를 입력받은 후,
		// 해당 MBTI에 맞는 문장 실행하기
		// 만약 해당하는 MBTI가 없다면 "업데이트 예정입니다." 출력하기
		
		// [선택지]
		// ESTP: 현실적이고, 실용적이다.
		// ENFJ: 착하고, 예의 바르고, 리더쉽 있고, 성격이 좋다.
		// INFP: 상상력이 풍부하다, 참을성이 많다, 온화하다.
		// ENFP: 분위기 메이커, 나무위키
		
		// switch 문
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 MBTI는?");
		String mbti = sc.next();
		String my = "";
		
//		switch(mbti) {
//		case "ESTP":
//			my = "현실적이고, 실용적이다.";
//			break;
//		case "ENFJ":
//			my = "착하고, 예의 바르고, 리더쉽 있고, 성격이 좋다.";
//			break;
//		case "INFP":
//			my = "상상력이 풍부하다, 참을성이 많다, 온화하다.";
//			break;
//		case "ENFP":
//			my = "분위기 메이커, 나무위키";
//			break;
//		default:
//			my = "업데이트 예정입니다.";
//		}
//		System.out.println(my);
//		
		// if문으로 바꾸기
		// type == "ENFJ" (x)
		// 문자열 비교는 equals() 메소드를 사용
		// "문자열1".equals("문자열2") : "문자열1"과 "문자열2"가 동일하는 true가 나옴 
		//System.out.println("A".equals("A"));
		// equalsIgnoreCase(): 대소문자 구분X
		
		if(mbti.equalsIgnoreCase("ESTP")) {
			my = "현실적이고, 실용적이다.";
		}else if(mbti.equals("ENFJ")) {
			my = "착하고, 예의 바르고, 리더쉽 있고, 성격이 좋다.";
		}else {
			my = "업데이트 예정입니다.";
		}
		System.out.println(my);
		
		
		
		
		
		
		
		
		
		
		
	}
}
