package java02_operator;

public class Basic_01 {
public static void main(String[] args) {
		
		//이항연산자 - 산술
		// + _ * / %(나머지)
		//-------------------------------------
		
		int num1 = 17, num2 = 3; // 피연산자
		
		int result; //연산의 결과값을 저장하는 변수
		
		result = num1 + num2;
//		result = 17 + 3; //변수의 값을 활용한다(불러온다)
//		result = 20; //덧셈 연산
		// -> result 변수에 20을 대입한다(저장한다)
		
		System.out.println("덧셈 결과 : " + result);
		
		System.out.println(num1 + "과 " + num2 + "의 합계 " + result);
		
		System.out.println("-----------------");
		
		///%
		//			나머지연산자
		//			modular operator
		//			mod 연산자
		
		result = num1 % num2;
//		result = 17 % 3;
//		result = 2;
		
		System.out.println("나머지 연산의 결과 : " + result);
		
		System.out.println("-----------------");
		
		System.out.println("---산술 연산자---");
		System.out.println("num1 + num2 = " + num1 + num2 );
		System.out.println("num1 + num2 = " + 17 + 3 );//변수값 활용
		System.out.println("num1 + num2 = 17" + 3 );//문자열 연결
		System.out.println("num1 + num2 = 173" );//문자열 연결
		
		System.out.println("-----------------");
		System.out.println("num1 + num2 = " + (num1 + num2) );
		System.out.println("num1 - num2 = " + (num1 - num2) );
		System.out.println("num1 * num2 = " + (num1 * num2) );
		System.out.println("num1 / num2 = " + (num1 / num2) ); // 5.6666..67이 아닌 5가 나옴(몫)
		System.out.println("num1 % num2 = " + (num1 % num2) ); // 2 (나머지)
		
		//산술 연산은 반드시 피연산자들의 데이터타입이 같아야 연산할 수 있다
		//산술 연산의 결과값도 피연산자들과 같은 데이터타입으로 반환된다
		
		System.out.println("-----------------");
		System.out.println(" 17 / 3 = " + (17/3)); //int/int -> int
		System.out.println("17.0 / 3. = " + (17.0/3.0)); // double/double -> double
		System.out.println("-----------------");
		
		System.out.println((double)num1 / (double)num2);
//		System.out.println((double)17 / (double)3);//변수의 활용
//		System.out.println( 17.0 / 3.0 );//double타입으로 형변환
//		System.out.println( 5.666666666666667 );//double타입의 나눗셈 연산
		
		System.out.println("-----------------");
		
		System.out.println( 11 + (int)34.56);
		System.out.println( 11 + 34.56 );
		
		System.out.println("-----------------");
		
		System.out.println( num1 / (double)num2 );//		int / (double)int
//		System.out.println( 17 / (double)3 );//변수활용		int / (double)int
//		System.out.println( 17 / 3.0 );//강제형변환			 int / double
//		System.out.println( 17.0 / 3.0 );// 자동형변환		double / double
//		System.out.println( 5.666666666666667 );// 나눗셈 수행
		
		System.out.println("-----잘못 사용한 경우------");
		
		System.out.println( (double)(num1 / num2));
//		System.out.println( (double)(17 / 3));//변수활용	(double)(int/int)
//		System.out.println( (double)(5));//나눗셈수행	(double)(int)
//		System.out.println( 5.0 );//강제형변환			 double
		
		System.out.println("-----------------");
		
		double dNum = 3.14;
		System.out.println("dNum / 2 = " + (dNum / 2));
		System.out.println("dNum % 2 = " + (dNum % 2));
		
		//** 실수 계산에서는 부동소수점의 오차가 발생할 수 있다! 주의할 것!
		// -> 0.00000000000001
	}
}
