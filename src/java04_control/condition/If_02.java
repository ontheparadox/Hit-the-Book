package java04_control.condition;

public class If_02 {
	public static void main(String[] args) {
	
		int num = 10;
		
		if( num == 15 ) {
			System.out.println("HI");
		}
		System.out.println("Hello");
		
		//----------------------------------
		
		// {}중괄호는 여러 개의 코드를 묶어주는 역할을 한다
		// 코드 실행 순서(흐름)에는 영향응ㄹ 주지 않는다
		
		{ 
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		
		System.out.println("---------------------------------");
		
		// 제어문은 해당 제어문 다음에 오는 코드 한 개 또는 {}중괄호 한 블럭에 영향을 준다
		
		if( false )
			System.out.println("코드 1111");	//실행되지 않는다
			System.out.println("코드 2222");	//실행된다
			
		System.out.println("---------------------------------");
		
		// 제어문에 영향을 받는 코드가 한 줄이어도 반드시 {}중괄호를 쓰도록 한다
		
		if( false ) {
			System.out.println("코드 1111");	//실행되지 않는다
		}
			System.out.println("코드 2222");	//실행된다
			
		System.out.println("---------------------------------");
		
		//제어문의 ()괄호 다음에 ;를 붙이지 않도록 조심한다 (실수로 많이 작성한다)
		
		if(false) {
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}

	}
}

