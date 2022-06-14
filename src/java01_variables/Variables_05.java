package java01_variables;

public class Variables_05 {
	
	@SuppressWarnings("unused") //코드에 warning(노란줄) 안 보이도록 설정
	public static void main(String[] args) {
		
		//학생의 나이
//		int student age; //에러, 띄어쓰기 금지
		
		int student_age; //snake case, 뱀 표기법
		
		int studentAge; //camel case, 낙타등 표기법
		
		//자바에서는 낙타등표기법(Camel Case)를 권장하고 있다
		
		//--------------------------------------------------------------
		
//		int 1stNumber; //에러, 숫자로 시작할 수 없다
		
		int firstNumber;
		
		//--------------------------------------------------------------
		
//		int int; //에러, 예약어(키워드)는 사용할 수 없다
		
		//대체 변수명을 사용한다
		int intNum;
		int intData;
		
		//--------------------------------------------------------------
		
		int a;
		int b;
		int c;
		//의미없는 변수명을 사용해서는 안된다!!!!!!!
		
		//간단한 의미라도 가지도록 변수명 사용할 것!
		int num1;
		int num2;
		int num3;
		
		//--------------------------------------------------------------
		
//		int _;//에러
		
//		의미없는, 알아보기 힘든 변수명은 사용하지 않도록한다!!
		int $$$$__$_$$$$_$$$_$_$;
		$$$$__$_$$$$_$$$_$_$ = 222;
		System.out.println( $$$$__$_$$$$_$$$_$_$ );
		
		//--------------------------------------------------------------
		
		int number;
		
		//이런 식의 변형도 좋지는 않음
		int _number;
		int number_;
		int $number;
		
		//차라리 뒤에 숫자(넘버링)을 붙이는 게 보기 좋음
		int number1;
		int number2;
		int number3;
		
		//--------------------------------------------------------------
		
		//한글로 변수명 설정은 가능하지만 절대! 사용하지 말 것!
		double 넓이;
		넓이 = 234.567;
		System.out.println("넓이 : " + 넓이);
		
	}
}



















