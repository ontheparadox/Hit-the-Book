package java01_variables;

public class VariablesQuiz {
	// ������ �˸��� Ÿ���� ���
		// �����ϰ�
		// ������ ��
		// ��� ������ �����͸� ����غ���.

		// �̸�, ����, ����, Ű

		//	��� ����
		//	�̸� : Alice
		//	���� : 99
		//	���� : ��
		//	Ű : 222.66

		//	ex)
		//	System.out.println("�̸� : " + name);
		public static void main(String[] args) {
			//1. ������ �˸��� Ÿ�� ���� - ������ ��� ����
			
			//	�̸�	- ���ڿ�, String
			//	����	- ������, int
			//	����	- ������, char
			//	Ű		- �Ǽ���, double
			
			
			//2. ���� �����ϱ�
			
			String name; //�̸� ����
			int age; //���� ����
			char gender; //���� ����
			double height; //Ű ����
			
			
			//3. �� �����ϱ�
			
			name = "Bob";
			age = 59;
			gender = 'F';
			height = 198.3;
			
			
			//4. ��� ������ ����ϱ�
			
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + age);
			System.out.println("���� : " + gender);
			System.out.println("Ű : " + height);
		
			System.out.println("--------------------------");
			
			System.out.println("�̸� : " + name + ", ���� : " + age + ", ���� : " + gender + ", Ű : " + height);
			
			System.out.println("--------------------------");
			
//			System.out.println("AAAAA");
//			System.out.println("BBBBB");
			
			System.out.print("AAAAA");
			System.out.print("BBBBB");
			
			// System.out.println() - �־��� �����͸� ����ϰ� �ٹٲ�(����)�Ѵ�
			// System.out.print() - �־��� �����͸� ����Ѵ�, �ٹٲ�(����)�� ���� �ʴ´�
			
			
			System.out.println(); //�ٹٲ� ���� �ڵ�
			
			
			System.out.println("--------------------------");
			
			System.out.print("�̸� : " + name);
			System.out.print(", ���� : " + age);
			System.out.print(", ���� : " + gender);
			System.out.println(", Ű : " + height);
			
			System.out.println("--------------------------");

			System.out.println(); //�ٹٲ� ���
			
			
			//  '\n' : �ٹٲ� ����, ���� ����
			
			System.out.println("HI\nHELLO\nHOLA");
			
		}
		
}
