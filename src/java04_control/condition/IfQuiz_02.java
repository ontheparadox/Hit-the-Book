package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input Number Q2: ");	
	int num = sc.nextInt();
	
	// ** �߰� : 0�� ����� ������� �ʴ´�
	
	if( num % 3 == 0 && num != 0 ) { //����
         System.out.print("num[" + num + "] ��/�� 3�� ����Դϴ�");
      }
            
      if( num % 3 != 0 ) { //����� ������ �ƴ�
         System.out.print("num[" + num + "] ��/�� 3�� ����� �ƴմϴ�");
      }
      if( num == 0 || num == 0 ) {
    	  System.out.println("num[" + num + "] ��/�� ����� �ƴմϴ�");
      }
	sc.nextLine();
	
	System.out.println("");
	}
}
