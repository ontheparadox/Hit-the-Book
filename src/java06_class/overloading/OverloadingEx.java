package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading ol = new Overloading();	//��ü ����
		
		System.out.println("--- display() ---");
		ol.display();
		
		//Setter�� �̿��� �� �Է�
		ol.setX(10);
		ol.setY(20);
		
		ol.display();
		
		System.out.println();
		System.out.println("--- display(55, 66) ---");
		ol.display(55, 66);
		
	}
}
