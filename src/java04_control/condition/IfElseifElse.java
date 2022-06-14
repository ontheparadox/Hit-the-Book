package java04_control.condition;

import java.util.Scanner;

public class IfElseifElse {
	public static void main(String[] args) {
		
		/*
		
		//if ~ else, if ~ else
		
		if( 조건식1) {
			//조건식1 이 참(true)일 때 수행하는 영역
		} else if( 조건식2 ) {
			// 조건식1 이 거짓(false)이고,
			// 조건식2 이 참(true)일 때 수행하는 영역
			
		} else if( 조건식3 ) {
			// 조건식1 이 거짓(false)이고,
			// 조건식2 이 거짓(false)이고,
			// 조건식3 이 참(true)일 때 수행하는 영역
			
		} else {
			// 조건식 1, 2, 3 모두 거짓(false)일 때 수행하는 영역
		}
		//** else if구문은 작성할 수 있는 구문 개수에 제한이 없다
		//** else if, else 구문은 필수가 아니다
		
		//** else만 사용하는 구문은 if문 전체의 마지막으로만 1개 올 수 있다
		
		//** if문 없이 단독으로 else if, else만 사용할 수 없다
		
		 */
		
		//------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if( num == 10) {
			System.out.println("10입니다");
		} else if( num == 20 ) {
			System.out.println("20입니다");
		} else if( num == 30 ) {
			System.out.println("30입니다");
		} else {
			System.out.println("10, 20, 30 모두 아닙니다");
		}
		
	}
}
