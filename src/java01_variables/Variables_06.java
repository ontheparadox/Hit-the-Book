package java01_variables;

public class Variables_06 {
	public static void main(String[] args) {
		
		System.out.println( 8765 ); // int형 상수 8765
		
		//--------------------------------------------------

		//변수
		int num;
		num = 1234;
		
		//--------------------------------------------------
		
		//변수의 상수화
		//	-> 이름있는 상수
		final int MAX;
		
		MAX = 100; //한번만 대입 가능하다
		
//		MAX = 200; //에러, 다시 대입 불가능하다
		
		//--------------------------------------------------
		
		
		
		//총 학생 수
//		final int studentTotalNumber = 36;
		final int STUDENT_TOTAL_NUMBER = 36;

		System.out.println("학생 " + STUDENT_TOTAL_NUMBER + "명의 평균값");

		
		
		//프로그램 실행 도중 함부로 값이 바뀌지 않도록 해준다
//		studentTotalNumber = 540;
		
		
		//평균 계산
		double average = 1000 / STUDENT_TOTAL_NUMBER;
		
		System.out.println("전체 평균 : " + average);
		
	}
}


















