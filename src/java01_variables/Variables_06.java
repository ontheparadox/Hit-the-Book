package java01_variables;

public class Variables_06 {
	public static void main(String[] args) {
		
		System.out.println( 8765 ); // int�� ��� 8765
		
		//--------------------------------------------------

		//����
		int num;
		num = 1234;
		
		//--------------------------------------------------
		
		//������ ���ȭ
		//	-> �̸��ִ� ���
		final int MAX;
		
		MAX = 100; //�ѹ��� ���� �����ϴ�
		
//		MAX = 200; //����, �ٽ� ���� �Ұ����ϴ�
		
		//--------------------------------------------------
		
		
		
		//�� �л� ��
//		final int studentTotalNumber = 36;
		final int STUDENT_TOTAL_NUMBER = 36;

		System.out.println("�л� " + STUDENT_TOTAL_NUMBER + "���� ��հ�");

		
		
		//���α׷� ���� ���� �Ժη� ���� �ٲ��� �ʵ��� ���ش�
//		studentTotalNumber = 540;
		
		
		//��� ���
		double average = 1000 / STUDENT_TOTAL_NUMBER;
		
		System.out.println("��ü ��� : " + average);
		
	}
}


















