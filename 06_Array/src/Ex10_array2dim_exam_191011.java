
public class Ex10_array2dim_exam_191011 {

	public static void main(String[] args) {
		//2차원 배열을 사용한 성적 처리
				//실습문제. 
				//  국어, 영어, 수학 점수 3개를 저장한 2차원 배열(sungjuk) 만들고
				//  성적을 입력하고 개인별 총점과 평균을 계산 하여 화면에 데이터 출력
				/*
					국어   영어  수학   총점     평균
					--------------------------
					100  90  80  270   90.0
					100  90  81  271   90.33
					95   85  77  257   85.66
					--------------------------
				*/
		
		int[][] sungjuk={{100,90,80},{100,90,81},{95,85,77}};//성적 2차원 배열 지정
		String[] name= {"국어","영어","수학","총점","평균"};//과목, 총점, 평균 일차원 배열 지정
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");//과목, 총점, 평균 출력
		}
		//윗구분선 출력
		System.out.println();
		System.out.println("-----------------------------------");
		//점수, 총점, 평균 출력
		for(int i=0; i<sungjuk.length; i++) {
			int sum=0;
			for(int j=0; j<sungjuk[i].length; j++) {
				sum = sum + sungjuk[i][j]; //총점 구하기 위한 누적
				System.out.print(sungjuk[i][j] + "\t");//과목 점수 출력
			}
			System.out.println(sum + "\t" + sum/sungjuk[i].length);//평균 출력
		}
		//아랫구분선 출력
		System.out.println("-----------------------------------");
		//끝.
	}

}












