package java04_control.condition;

import java.util.Scanner;

public class IfQuiz {
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
		
		System.out.println("");
		
		//--------------------------------------
		//Scanner sc = new Scanner(System.in)		처음 만들었던 입력 객체(Scanner) 하나만 만들어서 사용
		
		System.out.println("");
		
		//입력한 데이터가 3의 배수인지 판별
		// % 연산자 사용
		
		//숫자 하나 입력 받기
		System.out.print("Input Number Q2: ");	
		
		int num1 = sc.nextInt();
		
		if( num1 % 3 == 0 ) { //음수
	         System.out.print("num[" + num + "] 은/는 3의 배수입니다");
	      }
	            
	      if( num1 % 3 != 0 ) { //양수도 음수도 아닌
	         System.out.print("num[" + num + "] 은/는 3의 배수가 아닙니다");
	      }
		sc.nextLine();
		
		System.out.println("");
		
		//--------------------------------------
		
		System.out.println("");
		System.out.print("Input Number Q3 값1 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("Input Number Q3 값2 입력 : ");
		int num3 = sc.nextInt();
		
		
		
		if( num2 > num3) {
			System.out.print( num2 + "이 더 큰 수 ");
		}
		if( num2 < num3) {
			System.out.print( num3 + "이 더 큰 수");
		}
	
		sc.nextLine();
			
		}
	}

