package java03_scanner;

import java.util.Scanner;

public class scannerQuiz_02 {
public static void main(String[] args) {
	
	// �л� ���� ���� ���α׷�
	
	// �̸�, ����, ����, ����, ����, ����
	// 6���� ������ ������ �� �ִ� ������ �����
	// ������ ����� ������ ����� ���
	
	/* it's me
	
	String name = "Alice";	//Input name : Alice
	int age = 33;			//Input age : 33
	
	char gender = 'F';		//Input gender : F
	
    int korean = 100;
    int english = 99;
    int mathematics = 97;
    int total = (korean + english + mathematics);
    double average = (korean + english + mathematics)/3;
    
    System.out.println("�̸� " + "  " + "����" + "  "+ "����" + "  " + "����" + "  " + "����" + "  " + "����" + "  " + "����" + "  " + "���" );
    System.out.print( name + " ");
    System.out.print( age + "  ");
    System.out.print( gender + "  ");
    System.out.print( korean + "  ");
    System.out.print( english + "  ");
    System.out.print( mathematics + "  ");
    System.out.print( total + "  ");
    System.out.print( average );
    
	*/
	
	Scanner sc = new Scanner(System.in); //�Է� ��ü
	//-----------------------------------------------
	
	/*
	// ������Ÿ���� �⺻ ��
	String name = null;		//������ �⺻������ null(��)
	int age = 0;			//������ �⺻������ 0
	double average = 0.0;	//�Ǽ��� �⺻������ 0.0
	boolean isEmty = false; //���� �⺻������ false
	char gender = '\0';		//���ڰ� �⺻������ '\0' (�ι���, null����)
	*/
	
	//-----------------------------------------------
	
	//�̸� �Է�
	System.out.print("Input Name : ");
	String name = sc.nextLine();
	
//	System.out.println("[TEST] name : " + name );
	
	//���� �Է�
	System.out.print("Input Age : ");
	int age = sc.nextInt();
	
//	System.out.println("[TEST] age : " + age);
	
	sc.nextLine();		//�Է� ���� ����
	
	//���� �Է� 
	System.out.print("Input Gender : ");
	char gender = sc.nextLine().charAt(0);
	
//	System.out.println("[TEST] gender : " + gender);
	
	// ���� �Է� - ����, ����, ����
	System.out.print("Input Koean : ");
	int kor = sc.nextInt();
	
	System.out.print("Input English : ");
	int eng = sc.nextInt();
	
	System.out.print("Input Math : ");
	int math = sc.nextInt();
	
//	System.out.println("[TESET] ���� : " + kor + ", " + eng + ", " + math);
	
	//----------------------------------------------
	
	//���� ����ϱ�
	int sum = kor + eng + math;
	
	
	//��� ����ϱ�
	double avg = sum / (double)3;
	
//	System.out.println("[TEST] sum : " + sum);
//	System.out.println("[TEST] avg : " + avg);
	
	//-----------------------------------------------------------------
	
	System.out.println();	//�ٹٲ�
	System.out.println("---- ��� ----");
	
	System.out.println("�̸�\t����\t����\t����\t����\t����\t����\t���");
	
	System.out.print(name + "\t");
	System.out.print(age + "\t");
	System.out.print(gender + "\t");
	System.out.print(kor + "\t");
	System.out.print(eng + "\t");
	System.out.print(math + "\t");
	System.out.print(sum + "\t");
//	System.out.print(avg + "\t");
	
//	System.out.println(avg);
	System.out.printf("%.2f", avg);		//�Ҽ��� ��°�ڸ����� ���
}
}
