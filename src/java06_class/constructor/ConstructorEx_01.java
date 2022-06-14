package java06_class.constructor;

//��� Ŭ����
class Constructor{
	
	//��� + �ʵ�
	private int num1 = 111;	//�ʱⰪ 111
	private int num2 = 222;	//�ʱⰪ 222
	
	//������(JVM�� �ڵ����� �߰��ϴ�)
	//	**������ ������ : �Ű������� ���� ������
	public Constructor() { //�������� �⺻ ����(�ƹ��͵� ���� ����)
		
		System.out.println("����Ʈ ������");	//��ü �����ڸ� �̿��Ͽ� ���
		//----------------------------------
		
//		System.out.println("--- ������ �ڵ� ���� �� ---");
//		display();
		
		//����ʵ� �ʱ�ȭ �ڵ�
		num1 = 500;
		num2 = 600;
		
//		System.out.println("--- ������ �ڵ� ���� �� ---");
//		display();
		
	}
	
	//������ �����ε�
	// 	**�Ű����� �ִ� ������
	public Constructor(int num1, int num2) {	//�־��� ������ �ʱ�ȭ �ϱ� ���� ������ ����
		
		System.out.println("�Ű����� �ִ� ������");
		
		//�Ű������� ���޵� ������ ����ʵ带 �ʱ�ȭ�Ѵ�
		//	-> �������� �ֵ� ����
		this.num1 = num1;
		this.num2 = num2;
		
		
	}
	
	
	//��� �ʵ��� ���� Ȯ��(���)�ϴ� �޼ҵ�
	public void display() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
	}
	
}


//���� Ŭ����
public class ConstructorEx_01 {
	public static void main(String[] args) {
		
		Constructor cons1 = new Constructor();	//������ ȣ��
		cons1.display();
		
		System.out.println("---------------");
		
		Constructor cons2 = new Constructor(888, 999);
		cons2.display();
		
	}
}

//���� ȭ�� ���� ����Ű : ctrl + shift + -
//���� ȭ�� ���� ����Ű : ctrl + shift + [


