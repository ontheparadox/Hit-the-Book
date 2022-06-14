package java04_control.condition;

public class If_01 {
	public static void main(String[] args) {
		
		
		//조건문 - if
	
/*		if( 조건식 ) {
			
			//조건식이 참(true)일 때 실행할 코드를 작성하는 영역
		
		}
*/		
		//** 조건식 : true/false로 판별되는 연산식
		
		//------------------------------------------------------
		
		if( true ) {
			System.out.println("출력 가능할까?");
		}
		if( false ) { //죽은 코드라 실행 안됨
			System.out.println("여기는 출력될까?");
		}
		
		System.out.println("여기는 if문 바깥쪽 코드입니다");
	}
}