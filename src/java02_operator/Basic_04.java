package java02_operator;

public class Basic_04 {
public static void main(String[] args) {
		
		//���� ������ - ��
		
		//		&&		||		!
		//		AND		OR		NOT
		
		//		** !(not) �����ڴ� ���� ������
		
		//		��(boolean) �������� ���踦 ������ ����� ��ȯ�Ѵ�
		
		//AND����� �ǿ����ڰ� ��� true�� �� ��ü ����� true
		//OR������ �ǿ����ڰ� �� �� �ϳ��� true�� �� ��ü ����� true
		
		//NOT������ �ǿ������� ���� �����Ѵ�(�ݴ�� �ٲ۴�)
		
		//	|| ( ������, Vertival Bar) - shift + \
		//-----------------------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		
		System.out.println("true&&false : " + (b1&&b2));//false
		System.out.println("true||false : " + (b1||b2));//true
		//-----------------------------------------------------------------
		System.out.println("------------------");
		
		int num = 77;
		
		System.out.println(num>=1);//true
		System.out.println(num<=100);//true
		System.out.println(num>=1 && num<=100);//true
		
		
	}
}
