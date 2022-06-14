package java06_class.field;

public class MemberField_01 {
	
	//멤버 필드
	private int num = 999;
	private String name = "Alice";
	
	

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	System.out.println();
	System.out.println("---- 클래스 변수 테스트 ----");
	
	MemberField_02 mf04 = new MemberField_02();		//변수가 선언할 시점이 코드가 실행되고 있을 때라 동적임
	MemberField_02 mf05 = new MemberField_02();
	
	System.out.println( mf04.city );
	System.out.println( mf05.city );
	
	mf04.city = "Busan";
	
	System.out.println(">> Busan 대입 후 ");
	System.out.println( mf04.city );
	System.out.println( mf05.city );
	
	MemberField_02.city = "Incheon";	//클래스명에 멤버 필드 지정
	System.out.println( MemberField_02.city );
	
	// **클래스 변수를 사용할 땐 객체 변수가 아닌 클래스명으로 참조해서 사용
	
	
	
	
		}
	}
