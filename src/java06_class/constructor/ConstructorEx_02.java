package java06_class.constructor; 

//��� Ŭ����
class Constructor_02 {
	
	//����ʵ�
	private int n1;
	private int n2;
	
	
	//������
	
	
	
	
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
		
	}
}
