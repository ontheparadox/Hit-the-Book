package java01_variables;

public class VariablesQuiz {
	// 변수에 알맞은 타입을 골라
		// 선언하고
		// 대입한 후
		// 모든 변수의 데이터를 출력해보자.

		// 이름, 나이, 성별, 키

		//	출력 예시
		//	이름 : Alice
		//	나이 : 99
		//	성별 : 남
		//	키 : 222.66

		//	ex)
		//	System.out.println("이름 : " + name);
		public static void main(String[] args) {
			//1. 변수에 알맞은 타입 고르기 - 변수의 사용 목적
			
			//	이름	- 문자열, String
			//	나이	- 정수형, int
			//	성별	- 문자형, char
			//	키		- 실수형, double
			
			
			//2. 변수 선언하기
			
			String name; //이름 변수
			int age; //나이 변수
			char gender; //성별 변수
			double height; //키 변수
			
			
			//3. 값 대입하기
			
			name = "Bob";
			age = 59;
			gender = 'F';
			height = 198.3;
			
			
			//4. 모든 데이터 출력하기
			
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("성별 : " + gender);
			System.out.println("키 : " + height);
		
			System.out.println("--------------------------");
			
			System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 키 : " + height);
			
			System.out.println("--------------------------");
			
//			System.out.println("AAAAA");
//			System.out.println("BBBBB");
			
			System.out.print("AAAAA");
			System.out.print("BBBBB");
			
			// System.out.println() - 주어진 데이터를 출력하고 줄바꿈(개행)한다
			// System.out.print() - 주어진 데이터를 출력한다, 줄바꿈(개행)은 하지 않는다
			
			
			System.out.println(); //줄바꿈 수행 코드
			
			
			System.out.println("--------------------------");
			
			System.out.print("이름 : " + name);
			System.out.print(", 나이 : " + age);
			System.out.print(", 성별 : " + gender);
			System.out.println(", 키 : " + height);
			
			System.out.println("--------------------------");

			System.out.println(); //줄바꿈 출력
			
			
			//  '\n' : 줄바꿈 문자, 개행 문자
			
			System.out.println("HI\nHELLO\nHOLA");
			
		}
		
}
