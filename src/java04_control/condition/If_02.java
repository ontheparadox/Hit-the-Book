package java04_control.condition;

public class If_02 {
	public static void main(String[] args) {
	
		int num = 10;
		
		if( num == 15 ) {
			System.out.println("HI");
		}
		System.out.println("Hello");
		
		//----------------------------------
		
		// {}�߰�ȣ�� ���� ���� �ڵ带 �����ִ� ������ �Ѵ�
		// �ڵ� ���� ����(�帧)���� �������� ���� �ʴ´�
		
		{ 
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		
		System.out.println("---------------------------------");
		
		// ����� �ش� ��� ������ ���� �ڵ� �� �� �Ǵ� {}�߰�ȣ �� ���� ������ �ش�
		
		if( false )
			System.out.println("�ڵ� 1111");	//������� �ʴ´�
			System.out.println("�ڵ� 2222");	//����ȴ�
			
		System.out.println("---------------------------------");
		
		// ����� ������ �޴� �ڵ尡 �� ���̾ �ݵ�� {}�߰�ȣ�� ������ �Ѵ�
		
		if( false ) {
			System.out.println("�ڵ� 1111");	//������� �ʴ´�
		}
			System.out.println("�ڵ� 2222");	//����ȴ�
			
		System.out.println("---------------------------------");
		
		//����� ()��ȣ ������ ;�� ������ �ʵ��� �����Ѵ� (�Ǽ��� ���� �ۼ��Ѵ�)
		
		if(false) {
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}

	}
}

