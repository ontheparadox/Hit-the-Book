package java06_class.constructor;

//기능 클래스
class Constructor{
	
	//멤버 + 필드
	private int num1 = 111;	//초기값 111
	private int num2 = 222;	//초기값 222
	
	//생성자(JVM이 자동으로 추가하는)
	//	**디폴드 생성자 : 매개변수가 없는 생성자
	public Constructor() { //생성자의 기본 형태(아무것도 하지 않음)
		
		System.out.println("디폴트 생성자");	//객체 생성자를 이용하여 출력
		//----------------------------------
		
//		System.out.println("--- 생성자 코드 실행 전 ---");
//		display();
		
		//멤버필드 초기화 코드
		num1 = 500;
		num2 = 600;
		
//		System.out.println("--- 생성자 코드 실행 후 ---");
//		display();
		
	}
	
	//생성자 오버로딩
	// 	**매개변수 있는 생성자
	public Constructor(int num1, int num2) {	//주어진 값으로 초기화 하기 위해 생성자 생성
		
		System.out.println("매개변수 있는 생성자");
		
		//매개변수로 전달된 값으로 멤버필드를 초기화한다
		//	-> 생성자의 주된 역할
		this.num1 = num1;
		this.num2 = num2;
		
		
	}
	
	
	//멤버 필드의 값을 확인(출력)하는 메소드
	public void display() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
	}
	
}


//실행 클래스
public class ConstructorEx_01 {
	public static void main(String[] args) {
		
		Constructor cons1 = new Constructor();	//생성자 호출
		cons1.display();
		
		System.out.println("---------------");
		
		Constructor cons2 = new Constructor(888, 999);
		cons2.display();
		
	}
}

//수평 화면 분할 단축키 : ctrl + shift + -
//수직 화면 분할 단축키 : ctrl + shift + [


