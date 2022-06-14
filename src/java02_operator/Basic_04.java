package java02_operator;

public class Basic_04 {
public static void main(String[] args) {
		
		//이항 연산자 - 논리
		
		//		&&		||		!
		//		AND		OR		NOT
		
		//		** !(not) 연산자는 단항 연산자
		
		//		논리(boolean) 데이터의 관계를 따져서 결과를 반환한다
		
		//AND연사는 피연산자가 모두 true일 때 전체 결과가 true
		//OR연산은 피연산자가 둘 중 하나라도 true일 때 전체 결과가 true
		
		//NOT연산은 피연산자의 논리를 부정한다(반대로 바꾼다)
		
		//	|| ( 수직바, Vertival Bar) - shift + \
		//-----------------------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		
		System.out.println("true&&false : " + (b1&&b2));//false
		System.out.println("true||false : " + (b1||b2));//true
		//-----------------------------------------------------------------
		System.out.println("------------------");
		
		int num = 77;
		
		System.out.println(num>=1);//true
		System.out.println(num<=100);//true
		System.out.println(num>=1 && num<=100);//true
		
		
	}
}
