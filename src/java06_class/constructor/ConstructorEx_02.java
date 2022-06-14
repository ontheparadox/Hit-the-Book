package java06_class.constructor; 

//기능 클래스
class Constructor_02 {
	
	//멤버필드
	private int n1;
	private int n2;
	
	
	//생성자
	
	
	
	
	//모든 멤버필드의 값을 출력하는 간능
	public void out() {
		
		System.out.println("n1: " + n1 + ", n2: " + n2);
		
		
	}
	
	
}



//실행 클래스
public class ConstructorEx_02 {
	public static void main(String[] args) {
		
		Constructor_02 cons01 = new Constructor_02();
		cons01.out();
		
	}
}
