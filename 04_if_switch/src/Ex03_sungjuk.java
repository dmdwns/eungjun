
public class Ex03_sungjuk {

	public static void main(String[] args) {
		/* (실습) 성적처리
		국어(kor), 영어(eng), 수학(math) 점수
		총점(tot) = 국어 + 영어 + 수학
		평균(avg) = 총점 / 3
		-------------------
		평가 : 평균점수를 기준으로 평가
		90 ~ 100 : A
		80 ~ 89 : B
		70 ~ 79 : C
		60 ~ 69 : D
		60 미만(0~59) : F 재수강
		============================
		<출력형태>
		국어 : 100   <- kor
		영어 : 90    <- eng
		수학 : 80    <- math
		---------
		총점 : 270   <- tot
		평균 : 90    <- avg
		<평가결과>
		A
		*******************************/
		//int kor, eng, math;
		//int kor = 100, eng = 90, math = 80;
		//성적 데이타 입력
		int kor = 100;
		int eng = 90;
		int math = 80;
		
		System.out.println("<성적 평가 결과>");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("---------");
		
		int tot = kor + eng + math;
		System.out.println("총점 : " + tot);
		
		int avg = tot / 3;
		System.out.println("평균 : " + avg);
		
		System.out.println("<평가결과>");
		
		//평균에 대한 평가처리
		String result = "";
		if (avg >= 90) {
			System.out.println("A");
			result = "A";
		} else if (avg >= 80) {
			System.out.println("B");
			result = "B";
		} else if (avg >= 70) {
			System.out.println("C");
			result = "C";
		} else if (avg >= 60) {
			System.out.println("D");
			result = "D";
		} else {
			System.out.println("F 재수강");
			result = "F 재수강";
		}
		
		//====================================
		System.out.println("===================");
		System.out.println("<성적 평가 결과>");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("---------");
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("<평가결과>");
		System.out.println(result);
		
		
	}

}












