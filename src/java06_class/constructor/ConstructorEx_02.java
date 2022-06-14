package java06_class.constructor; 

//��� Ŭ����
class Constructor_02 {
	
	//����ʵ�
	private int n1;
	private int n2;
	
	public Constructor_02(int n1, int n2) {	//����ʵ� x, y�� ���� ����
		
		System.out.println("�Ű������� 2���� ������");
		
		this.n1 = n1;
		this.n2 = n2;
		
		
	}
	
	public Constructor_02(int n1) {
		this(n1, 0);	//this������ ȣ��
		
		System.out.println("�Ű������� 1���� ������");
		
	}
	
	
	//������
	public Constructor_02() {
		//this ������ ȣ���ϱ�
		this(0, 0);
			
		System.out.println("����Ʈ ������");
		
//		this.n1 = 0;
//		this.n2 = 0;			//����ʵ�� ���� �ڵ�
		
	}
	
	//** this ������ ȣ��
	//	-> �����ڿ��� �����ε��� �ٸ� �����ڸ� ȣ���ϴ� ���
	//	-> �������ڵ��� ���뼺�� �����ش�
	// 	-> �������ڵ忡�� ù��° �ڵ�θ� ����� �� �ִ�
	
	
	
	//��� ����ʵ��� ���� ����ϴ� ����
	public void out() {
		
		System.out.println("n1: " + n1 + ", n2: " + n2);
		
		
	}
	
	
}



//���� Ŭ����
public class ConstructorEx_02 {
	public static void main(String[] args) {
		
		Constructor_02 cons01 = new Constructor_02();
		cons01.out();
		
		System.out.println("----------------------");
		
		Constructor_02 cons02 = new Constructor_02(555, 666);
		
	}
}


