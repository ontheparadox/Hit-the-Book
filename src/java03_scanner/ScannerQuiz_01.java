package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
public static void main(String[] args) {
	
	// 삼각형의 넓이 구하기
	// 삼각형 넓이 = (밑변 * 높이)/2
	// 밑변과 높이를 입력 받아 계산
		
/*	Scanner sc = new Scanner(System.in);

	double width1, height1, area1; // 삼각형의 밑변 길이, 높이 길이, 넓이 구하는 변수

	// 삼각형의 밑변과 높이, 넓이 등을 구하기

	System.out.print("삼각형의 밑변 길이 입력>> "); // 삼각형의 밑변 길이 출력 

	width1 = sc.nextDouble();

	System.out.print("삼각형의 높이 길이 입력>> "); // 삼각형의 높이 길이 출력

	height1 = sc.nextDouble();

	area1 = (width1 * height1) / 2.0; 				// (밑변 * 높이)/2

	System.out.println("삼각형의 넓이 = " + area1 +"㎡");

	System.out.println("------------------------------------------");

	System.out.println(); */

	System.out.println();
	
	System.out.println("------------------------------------------");
	System.out.println();
	
	//1. 필요한 변수 선언 ( + 데이터타입 생각하기)
	
	int base; //밑변
	int height; //높이
	
	double area;
	
	//2. 데이터 입력
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("밑변은? : ");
	base = sc.nextInt();
	
	System.out.print("높이는? : ");
	height = sc.nextInt();
	
	
	//3. 문제에 주어진 계산 수행
	area = (double)(base * height) / 2;		// double로 형변환
	// area = (base * height) / (double)2;
	
	//4. 결과 출력
	System.out.println("삼각형의 넓이는? : " + area);


	
	
	
	
}
}
