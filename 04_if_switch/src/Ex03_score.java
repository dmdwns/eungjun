
public class Ex03_score {

	public static void main(String[] args) {
		/*(실습) 성적처리
		국어(kor), 영어(eng), 수학(math) 점수
		총점(tot) = 국어 + 영어 + 수학
		평균(avg) = 총점 / 3
		-----------------------------------
		평가 : 평균점수를 기준으로 평가
		90 ~ 100 : A
		80 ~ 89 : B
		70 ~ 79 : C
		60 ~ 69 : D
		60미만(0~59) : F 재수강
		===================================
		출력형태
		국어 : 100
		영어 : 90
		수학 : 80
		-------------
		총점 : 270
		평균 : 90
		<평과결과>
		A
		**************************************/
		// int kor=100, eng=90, math=80;
		// int kor, eng, math;
		// kor=100;
		// eng=90;
		// math=80;
		// 밑에 방법 권장함
		int kor = 100;
		int eng = 90;
		int math = 80;
		int tot = kor + eng + math ;
		int avg = tot/3;
		System.out.println(">>>if문 이용<<<");
		System.out.println("<출력형태>");
		System.out.println("국어 : " +kor);
		System.out.println("영어 : " +eng);
		System.out.println("수학 : " +math);
		System.out.println("총점 : " +tot);
		System.out.println("평균 : " +avg);
		if (avg>=90 && avg<=100) {
			System.out.println("평과결과: A");
		}
		if (avg>=80 && avg<=89) {
			System.out.println("평과결과: B");
		}
		if (avg>=70 && avg<=79) {
			System.out.println("평과결과: C");
		}
		if (avg>=60 && avg<=69) {
			System.out.println("평과결과: D");
		}
		if (avg>=0 && avg<60) {
			System.out.println("평과결과: F재수강");
		}
		
		System.out.println("======================================");
		
		System.out.println(">>>else if 이용<<<");
		if(avg>=90 && avg<=100) {
			System.out.println("평과결과: A");
		} else if (avg>=80 && avg<=89) {
			System.out.println("평과결과: B");
	    } else if (avg>=70 && avg<=79) {
	    	System.out.println("평과결과: C");
	    } else if (avg>=60 && avg<=69) {
	    	System.out.println("평과결과: D");
	    } else {
	    	System.out.println("평과결과: F재수강");
	    }
		
		System.out.println("======================================");

		
		if (avg>=90) {
			System.out.println("평과결과: A");
			
		} else if (avg>=80) {
			System.out.println("평과결과: B");
			
		} else if (avg>=70) {
			System.out.println("평과결과: C");
			
		} else if (avg>=60) {
			System.out.println("평과결과: D");
			
		} else {
			System.out.println("평과결과: F재수강");
			
		}
		
		System.out.println("======================================");
		
		
	}	

}




