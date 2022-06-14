package java06_class.field;

public class MemberField_03 {
	
	//---- 멤버 필드 ----
	private int num1 = 777; //인스턴스 변수
	private static int num2 = 888;	//클래스 변수
	
	
	//---- 일반 멤버 메소드 ----
	public void method() {
		
		System.out.println( num1 );	//인스턴스 변수 출력
		System.out.println( num2 );	//클래스 변수 출력
		
		//-----------------------------------------------
		
		int num1 = 101; //지역 변수 출력
		int num2 = 202; //지역 변수 출력
		
		System.out.println("----");
		System.out.println( num1 );	//지역 변수 출력
		System.out.println( num2 );	//지역 변수 출력
		
		//-----------------------------------------------
		
		System.out.println( this.num1 ); //멤버필드
		
//		System.out.println( this.num2 ); //멤버필드
		System.out.println( MemberField_03.num2 ); //정적 멤버필드
		
		
		System.out.println();
		System.out.println("--- 지역변수 테스트 ---");
		MemberField_03 mf06 = new MemberField_03();
		
		
	}
}
