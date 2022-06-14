package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input Number Q2: ");	
	int num = sc.nextInt();
	
	// ** 추가 : 0은 배수로 취급하지 않는다
	
	if( num % 3 == 0 && num != 0 ) { //음수
         System.out.print("num[" + num + "] 은/는 3의 배수입니다");
      }
            
      if( num % 3 != 0 ) { //양수도 음수도 아닌
         System.out.print("num[" + num + "] 은/는 3의 배수가 아닙니다");
      }
      if( num == 0 || num == 0 ) {
    	  System.out.println("num[" + num + "] 은/는 배수가 아닙니다");
      }
	sc.nextLine();
	
	System.out.println("");
	}
}
