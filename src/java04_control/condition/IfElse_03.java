package java04_control.condition;

//전체 코드 선택 단축키 : ctrl + a
//들여쓰기 정렬 단축키 : ctrl + i
//전체 문서 양식 변경 : ctrl + shift  f (절대 쓰지말기)

import java.util.Scanner;

public class IfElse_03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 33;

		if( num > 0 && num <= 100 ) {
			System.out.println("1~100 사이의 정수");
		}

		System.out.println("-----------------");

		if( num > 0 ) {
			System.out.println("0보다 크다");

			if( num <= 100 ) {
				System.out.println("0보다 크다");
				System.out.println("100보다 작거나 같다");
			}
			System.out.println("0보다 크다");
		} else {
			System.out.println("0보다 크지 않다");
			
			if( num == 0) {
				System.out.println("0과 같다");
			} else {
				System.out.println("0보다 작다");
			}
			System.out.println("0보다 크지 않다");
		}
	}
}
