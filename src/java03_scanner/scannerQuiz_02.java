package java03_scanner;

import java.util.Scanner;

public class scannerQuiz_02 {
public static void main(String[] args) {
	
	// 학생 정보 관리 프로그램
	
	// 이름, 나이, 성별, 국어, 영어, 수학
	// 6가지 정보를 저장할 수 있는 변수를 만들고
	// 총점과 평균을 포함한 결과를 출력
	
	/* it's me
	
	String name = "Alice";	//Input name : Alice
	int age = 33;			//Input age : 33
	
	char gender = 'F';		//Input gender : F
	
    int korean = 100;
    int english = 99;
    int mathematics = 97;
    int total = (korean + english + mathematics);
    double average = (korean + english + mathematics)/3;
    
    System.out.println("이름 " + "  " + "나이" + "  "+ "성별" + "  " + "국어" + "  " + "영어" + "  " + "수학" + "  " + "총점" + "  " + "평균" );
    System.out.print( name + " ");
    System.out.print( age + "  ");
    System.out.print( gender + "  ");
    System.out.print( korean + "  ");
    System.out.print( english + "  ");
    System.out.print( mathematics + "  ");
    System.out.print( total + "  ");
    System.out.print( average );
    
	*/
	
	Scanner sc = new Scanner(System.in); //입력 객체
	//-----------------------------------------------
	
	/*
	// 데이터타입의 기본 값
	String name = null;		//참조값 기본데이터 null(널)
	int age = 0;			//정수값 기본데이터 0
	double average = 0.0;	//실수값 기본데이터 0.0
	boolean isEmty = false; //논리값 기본데이터 false
	char gender = '\0';		//문자값 기본데이터 '\0' (널문자, null문자)
	*/
	
	//-----------------------------------------------
	
	//이름 입력
	System.out.print("Input Name : ");
	String name = sc.nextLine();
	
//	System.out.println("[TEST] name : " + name );
	
	//나이 입력
	System.out.print("Input Age : ");
	int age = sc.nextInt();
	
//	System.out.println("[TEST] age : " + age);
	
	sc.nextLine();		//입력 버퍼 비우기
	
	//성별 입력 
	System.out.print("Input Gender : ");
	char gender = sc.nextLine().charAt(0);
	
//	System.out.println("[TEST] gender : " + gender);
	
	// 점수 입력 - 국어, 영어, 수학
	System.out.print("Input Koean : ");
	int kor = sc.nextInt();
	
	System.out.print("Input English : ");
	int eng = sc.nextInt();
	
	System.out.print("Input Math : ");
	int math = sc.nextInt();
	
//	System.out.println("[TESET] 점수 : " + kor + ", " + eng + ", " + math);
	
	//----------------------------------------------
	
	//총점 계산하기
	int sum = kor + eng + math;
	
	
	//평균 계산하기
	double avg = sum / (double)3;
	
//	System.out.println("[TEST] sum : " + sum);
//	System.out.println("[TEST] avg : " + avg);
	
	//-----------------------------------------------------------------
	
	System.out.println();	//줄바꿈
	System.out.println("---- 출력 ----");
	
	System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
	
	System.out.print(name + "\t");
	System.out.print(age + "\t");
	System.out.print(gender + "\t");
	System.out.print(kor + "\t");
	System.out.print(eng + "\t");
	System.out.print(math + "\t");
	System.out.print(sum + "\t");
//	System.out.print(avg + "\t");
	
//	System.out.println(avg);
	System.out.printf("%.2f", avg);		//소수점 둘째자리까지 출력
}
}
