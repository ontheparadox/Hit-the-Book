package java02_operator;

public class Unary_02 {
	public static void main(String[] args) {
		
		//단항연산자 - 증감
		
		// ++ : 증가연산자
		// -- : 감소연산자
		
		//피연산자로 적용한 변수의 값을 1증가(감소) 시킨다
		
		int num;
		
		num = 15; //변수를 15로 초기화
		
		System.out.println( num );	  //활용 후 감소
		System.out.println( num-- );  //감소연산, 후위 감소, 후치 감소
		System.out.println( num );
		
		System.out.println("");
		
		num = 15; //변수를 15로 초기화
		
		System.out.println( num );
		
		--num;
		
		System.out.println( num-- );  //감소연산
		System.out.println( num );
		
		// ** 전위 증감연산자는 변수의 값을 활용하기 전에 변수의 값을 증감시킨다
		// ** 후위 증감연산자는 변수의 값을 활용하기 후에 변수가 값을 증감시킨다
	
		System.out.println("");
		 
		num = 15;
		
		System.out.println( num );
		
		--num; //활용하는 코드 이전에 수행하면 전후 증감을 따지지 않아도 된다
		
		System.out.println( num );  
		System.out.println( num );
		
		System.out.println("");
		
		num = 13;
		
		System.out.println( num++ - 10 - ++num);
		
		System.out.println( num );
		
		//최종 출력결과는?
		//연산수행 후 num 변수의 값?
		
	}
}
