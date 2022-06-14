package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//숫자 하나를 입력 받아 양수인지 음수인지 판별
		System.out.print("Input Number Q1: ");
		
		int num = sc.nextInt(); //입력 값 변수, 숫자 하나 입력 받기
		
		
		//양수, 음수 판별하기
		if( num > 0 ) { //양수
			System.out.print(num + "이/가 양수입니다.");
		}
		if( num < 0 ) { //음수
			System.out.print(num + "이/가 음수입니다");
		}
		if (num == 0) { //0, 양수도 음수도 아닌 경우
			System.out.print("0 입니다");
		}
		
		sc.nextLine();
	}
}
