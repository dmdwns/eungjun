
public class Ex02_boolean {

	public static void main(String[] args) {
		//boolean : true, false 값을 가짐(논리형)
		//타입 변수명 = 초기값;
		boolean bool1 = true; //문자열 "true"이 아님
		boolean bool2 = false;

		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		System.out.println("-----------------");
		
		bool1 = false;
		if (bool1) { //bool1 의 값이 true 면 실행
			System.out.println("if문 : bool1이 참(true)이면 실행");
		} else { //bool1 의 값이 false 일때 실행
			System.out.println("if문 : bool1이 거짓(false)이면 실행");
		}
		
		System.out.println("--- main() 끝 ---");
	}
}







