package java04_control.condition;

import java.util.Scanner;

public class IfQuiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���� �ϳ��� �Է� �޾� ������� �������� �Ǻ�
		System.out.print("Input Number Q1: ");
		
		int num = sc.nextInt(); //�Է� �� ����, ���� �ϳ� �Է� �ޱ�
		
		
		//���, ���� �Ǻ��ϱ�
		if( num > 0 ) { //���
			System.out.print(num + "��/�� ����Դϴ�.");
		}
		if( num < 0 ) { //����
			System.out.print(num + "��/�� �����Դϴ�");
		}
		if (num == 0) { //0, ����� ������ �ƴ� ���
			System.out.print("0 �Դϴ�");
		}
		
		sc.nextLine();
		
		System.out.println("");
		
		//--------------------------------------
		//Scanner sc = new Scanner(System.in)		ó�� ������� �Է� ��ü(Scanner) �ϳ��� ���� ���
		
		System.out.println("");
		
		//�Է��� �����Ͱ� 3�� ������� �Ǻ�
		// % ������ ���
		
		//���� �ϳ� �Է� �ޱ�
		System.out.print("Input Number Q2: ");	
		
		int num1 = sc.nextInt();
		
		if( num1 % 3 == 0 ) { //����
	         System.out.print("num[" + num + "] ��/�� 3�� ����Դϴ�");
	      }
	            
	      if( num1 % 3 != 0 ) { //����� ������ �ƴ�
	         System.out.print("num[" + num + "] ��/�� 3�� ����� �ƴմϴ�");
	      }
		sc.nextLine();
		
		System.out.println("");
		
		//--------------------------------------
		
		System.out.println("");
		System.out.print("Input Number Q3 ��1 �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("Input Number Q3 ��2 �Է� : ");
		int num3 = sc.nextInt();
		
		
		
		if( num2 > num3) {
			System.out.print( num2 + "�� �� ū �� ");
		}
		if( num2 < num3) {
			System.out.print( num3 + "�� �� ū ��");
		}
	
		sc.nextLine();
			
		}
	}

