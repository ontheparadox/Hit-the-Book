package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_01 {
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
	}
}
