package java06_class.field;

//	** static 메소드, 정적메소드
// -> 클래스를 이용하여 객체 생성을 하지 않아도 곧바로 실행가능하도록 준비해놓는 메소드

public class MemberField_02 {
	
	//멤버 필드 -> 인스턴스 변수
	private int num;
	
	//멤버 필드 -> 클래스 변수, static 변수, 정적 변수
	// 움직일 수 없는 고정된 상태의 변수
//	private static String city = "Seoul";
//	public static final String CITY = "Seoul";
	// -> static 변수는 public 접근제한자를 적용하는 게 일반적이다
	
	public static final String CITY = "Seoul";
	// -> 모든 객체에서 값을 변경할 땐 객체 변수가 있기 때문에 final 키워드로 상수화 시키는 경우가 많다
	// -> 상수화되면 변수명은 모두 대문자로!
	

	
	
}
