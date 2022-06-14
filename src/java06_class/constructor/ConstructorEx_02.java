package java06_class.constructor; 

//기능 클래스
class Constructor_02 {
	
	//멤버필드
	private int n1;
	private int n2;
	
	public Constructor_02(int n1, int n2) {	//멤버필드 x, y에 값을 대입
		
		System.out.println("매개변수가 2개인 생성자");
		
		this.n1 = n1;
		this.n2 = n2;
		
		
	}
	
	public Constructor_02(int n1) {
		this(n1, 0);	//this생성자 호출
		
		System.out.println("매개변수가 1개인 생성자");
		
	}
	
	
	//생성자
	public Constructor_02() {
		//this 생성자 호출하기
		this(0, 0);
			
		System.out.println("디폴트 생성자");
		
//		this.n1 = 0;
//		this.n2 = 0;			//멤버필드랑 같은 코드
		
	}
	
	//** this 생성자 호출
	//	-> 생성자에서 오버로딩된 다른 생성자를 호출하는 방법
	//	-> 생성자코드의 재사용성을 높여준다
	// 	-> 생성자코드에서 첫번째 코드로만 사용할 수 있다
	
	
	
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
		
		System.out.println("----------------------");
		
		Constructor_02 cons02 = new Constructor_02(555, 666);
		
	}
}


