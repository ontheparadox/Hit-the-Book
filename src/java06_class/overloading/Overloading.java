package java06_class.overloading;

//��� Ŭ����
public class Overloading {
	
		//---- ��� �ʵ� ----
		private int x;
		private int y;
		
		//---- ��� �޼ҵ� ----
		public void display() {	//����ʵ�, x, �� ����ϴ� ���
			System.out.println("(" + x + ", " + y + ")");
		}
		
		public void display(int x, int y) { //����ʵ� x, y�� ���� �����ϰ� ����ϴ� ���
			
//			this.x = x;
//			this.y = y;
			
			this.setX(x);
			this.setY(y);
			
//			System.out.println("(" + x + ", " + y + ")");
			
			display();
			
			//---- �����ε� �׽�Ʈ �޼ҵ� ----
			
//			public void display(int num) {}
//			
//			public void display(double num) {}
//			
//			public void (String data, int num) {}
//			
//			public void display(int num, String data) {}
			
			
			//����, �Ű������� �̸��� �޶� �ڷ��� ���°� ������ �����ε� ���� ����
			//  public void display(int data){}
			
			//����, ���������ڴ� �����ε� ���ǿ� ���Ե��� �ʴ´�
			//	private void display(double num){}
			
			//����, ��ȯŸ�Ը� �ٸ� �� �����ε����� �ʴ´�
			//	public int display(){
			//		return 0;
			// }
			
			
			
		}
		
		
		//---- Getters, Setters ----
		//���ͼ��� ���� ����Ű : alt + shift + s, r 
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
}
