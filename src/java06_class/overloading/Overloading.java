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
