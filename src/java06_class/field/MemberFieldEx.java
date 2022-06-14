package java06_class.field;

public class MemberFieldEx {
	public static void main(String[] args) {
		
		MemberField_01 mf01 = new MemberField_01();
		
		MemberField_01 mf02 = new MemberField_01();
		
		MemberField_01 mf03 = null;
		
		// ** null 키워드(널, 눌) - 참조형 데이터의 기본값
		// 	-> 참조할 대상이 없음을 표현한다
		
		mf02.setNum(777);
		System.out.println( mf01.getNum() );
		System.out.println( mf02.getNum() );
		
		//예외 발생 - NullPointerException
//		System.out.println( mf03.getNum() );
//		System.out.ptintln( mf03.getNum() );
		// -> NullPointerExcrption
		// -> null값에 .참조연산자를 사용한 상황
		
	}
}
