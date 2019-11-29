
public class Ex01_if {

	public static void main(String[] args) {
		/* 제어문-분기문(비교문) : if문
		if (조건문) {
			실행할 문장(들); <- 조건문의 결과가 참(true)일 때
		}
		*/
		int num1 = 30;
		int num2 = 20;

		System.out.println(">> 비교작업 전");
		if (num1 < num2) {
			System.out.println("num1이 num2보다 작다.");
		}
		System.out.println(">> 비교작업 후");
		
		System.out.println("=========================");
		/* 점수에 대한 평가 결과 출력
		90 ~ 100 : 우수
		80 ~ 89 : 양호
		70 ~ 79 : 보통
		60 ~ 69 : 미흡
		0 ~ 59 : 재평가
		--출력형태
		점수 : 90
		평가결과 : 우수
		*/
		System.out.println("--- 평가 결과 --");
		int jumsu = 80;
		System.out.println("점수 : " + jumsu);
		
		if (jumsu >= 90 && jumsu <= 100) {
			System.out.println("평가결과 : 우수");
			System.out.println("90이상일때만 실행");
		}
		if (jumsu >= 80 && jumsu <= 89) {
			System.out.println("평가결과 : 양호");
		}
		if (jumsu >= 70 && jumsu < 80) {
			System.out.println("평가결과 : 보통");
		}
		if (jumsu >= 60 && jumsu < 70) {
			System.out.println("평가결과 : 부족");
		}
		if (jumsu >= 0 && jumsu < 60) {
			System.out.println("평가결과 : 재평가");
		}
		
		System.out.println(">> 성적처리 끝");
	}

}











