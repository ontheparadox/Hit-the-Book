package java06_class.overloading;

//기능 클래스
public class Overloading {
	
		//---- 멤버 필드 ----
		private int x;
		private int y;
		
		//---- 멤버 메소드 ----
		public void display() {	//멤버필드, x, 를 출력하는 기능
			System.out.println("(" + x + ", " + y + ")");
		}
		
		public void display(int x, int y) { //멤버필드 x, y에 값을 저장하고 출력하는 기능
			
//			this.x = x;
//			this.y = y;
			
			this.setX(x);
			this.setY(y);
			
//			System.out.println("(" + x + ", " + y + ")");
			
			display();
			
			//---- 오버로딩 테스트 메소드 ----
			
//			public void display(int num) {}
//			
//			public void display(double num) {}
//			
//			public void (String data, int num) {}
//			
//			public void display(int num, String data) {}
			
			
			//에러, 매개변수의 이름이 달라도 자료형 형태가 같으면 오버로딩 되지 않음
			//  public void display(int data){}
			
			//에러, 접근제한자는 오버로딩 조건에 포함되지 않는다
			//	private void display(double num){}
			
			//에러, 반환타입만 다를 때 오버로딩되지 않는다
			//	public int display(){
			//		return 0;
			// }
			
			
			
		}
		
		
		//---- Getters, Setters ----
		//게터세터 생성 단축키 : alt + shift + s, r 
		
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
