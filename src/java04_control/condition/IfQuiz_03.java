package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_03 {
public static void main(String[] args) {
		//두 수를 입력 받아 큰 수를 출력
		// 		>> Input Number1 : 44
		//		>> Input Number2 : 88
		//		>> 88이 더 큰 수
	
		Scanner sc = new Scanner(System.in);
		
		//------------------------------------
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
		if( num1 > num2 ) { // num1이 큰 경우 
			System.out.println(num1 + "이/가 큽니다");
		}
		
		if( num1 < num2 ) { // num2이 큰 경우
			System.out.println(num2 + "이/가 큽니다");
		}
		
		if( num1 == num2 ) { //같은 경우
			System.out.println("두 숫자가 " + num1 + "(으)로 같습니다");
		}
	}
}
