package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
public static void main(String[] args) {
	
	// �ﰢ���� ���� ���ϱ�
	// �ﰢ�� ���� = (�غ� * ����)/2
	// �غ��� ���̸� �Է� �޾� ���
		
/*	Scanner sc = new Scanner(System.in);

	double width1, height1, area1; // �ﰢ���� �غ� ����, ���� ����, ���� ���ϴ� ����

	// �ﰢ���� �غ��� ����, ���� ���� ���ϱ�

	System.out.print("�ﰢ���� �غ� ���� �Է�>> "); // �ﰢ���� �غ� ���� ��� 

	width1 = sc.nextDouble();

	System.out.print("�ﰢ���� ���� ���� �Է�>> "); // �ﰢ���� ���� ���� ���

	height1 = sc.nextDouble();

	area1 = (width1 * height1) / 2.0; 				// (�غ� * ����)/2

	System.out.println("�ﰢ���� ���� = " + area1 +"��");

	System.out.println("------------------------------------------");

	System.out.println(); */

	System.out.println();
	
	System.out.println("------------------------------------------");
	System.out.println();
	
	//1. �ʿ��� ���� ���� ( + ������Ÿ�� �����ϱ�)
	
	int base; //�غ�
	int height; //����
	
	double area;
	
	//2. ������ �Է�
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�غ���? : ");
	base = sc.nextInt();
	
	System.out.print("���̴�? : ");
	height = sc.nextInt();
	
	
	//3. ������ �־��� ��� ����
	area = (double)(base * height) / 2;		// double�� ����ȯ
	// area = (base * height) / (double)2;
	
	//4. ��� ���
	System.out.println("�ﰢ���� ���̴�? : " + area);


	
	
	
	
}
}
