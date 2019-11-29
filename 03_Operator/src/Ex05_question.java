
public class Ex05_question {

	public static void main(String[] args) {
		//조건연산자 or 삼항연산자
		// 조건 ? 실행문1 : 실행문2;
		// 조건 ? true일때 실행문장 : false일때 실행문장;
		int num1 = 30;
		int num2 = 20;
		boolean isBig = true;
		isBig = num1 > num2;
		
		System.out.println("num1: " + num1 + ", num2: " + num2);
		System.out.println("num1 > num2 : " + isBig);
		
		String str = (num1 > num2) ? "num1이 크다" : "num1이 크지 않다" ;
		System.out.println("num1 > num2 결과는? " + str);
		
		if (num1 > num2) { //조건식 결과 true인 경우 실행문
			str = "num1이 크다";
		} else { //조건식 결과 false인 경우 실행문
			str = "num1이 크지 않다";
		}
		System.out.println("num1 > num2 if문 결과는? " + str);
	}

}












