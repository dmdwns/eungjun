/** 문서작성용 주석
 * 
 * @author bitcamp
 *
 */
/* 주석문(여러줄 주석처리)
명명규칙(반드시 지킬 것) - 클래스명 작성 규칙
 - 영문대소문자, 숫자, 특수문자(_, $) 사용
 - 대소문자 구분사용(Hello, HELLO, HeLLo - 3가지 이름), 
 - 길이 제한 없음 
 - 예약어(키워드) 사용안됨
 - 숫자로 시작 안됨(Ex01 허용, 01Ex 안됨)
 
명명규칙(개발자들 간의 약속)
 - 클래스(인터페이스)명의  첫글자는 대문자로 시작 한다
 - 복합단어인 경우 단어의 첫글자를 대문자로 작성(HelloWorld)
 - 변수명, 메소드명은 소문자로 시작한다.
 - 상수명은 전체 대문자로 작성하고 복합어의 구분은 언더바(_) 사용
   (PI, MAX_NUMBER)
*/
// 주석문(한줄 주석처리)
public class Ex01 {
	
	public static void main(String[] args) {
		System.out.println("Hello World~~");
		System.out.println("계산결과: " + 1 + 2);
		System.out.println("계산결과: " + (1 + 2));
		System.out.println("계산결과: " + 1 * 2);
		System.out.println("계산결과: " + (1 - 2));
		
		System.out.println("\"안녕하세요\""); // "안녕하세요~~"
		System.out.println("\\안녕하세요\\");
		System.out.println("'안녕하세요'");
		System.out.println("---------");
		
		System.out.println("홍길동님!");
		System.out.println("반갑습니다.");
		System.out.println("---------");
		
		System.out.println("홍길동님!\n반갑습니다."); //n : new line
		System.out.println("홍길동님!\t반갑습니다.");
		
		//----------------------------
		//변수(variable)의 선언
		//데이타타입 변수명;
		//변수명 = 값;
		//---
		//데이타타입 변수명 = 값(초기값);
		System.out.println("==========");
		String str1; //str1 변수 선언만
		str1 = "홍길동님!";
		String str2 = "반갑습니다";
		System.out.println(str1 + str2);
	}
}









