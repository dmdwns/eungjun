package com.mystudy.ex10_map_sungjuk;
/* 자바빈(JavaBean) 형태의 클래스 작성
	VO(Value Object) : 값을 저장하기 위한 클래스(객체)
	DTO(Data Transfer Object) : 값을 저장해서 전달하기 위한 클래스(객체)
	-> XxxxVO, XxxxVo, XxxxDTO, XxxxDto
*/
public class StudentVO {
	// 필드선언 -------------------
	private String name; // - name : String
	private int kor;
	private int eng; 
	private int math; 
	
	private int tot; 
	private double avg;
	
	// 생성자 선언 ------------------
	//생성자 : 성명, 국어, 영어, 수학 점수를 입력받는 생성자
	//   총점, 평균 값 자동 계산 처리
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	//public StudentVO() {} //기본생성자(default constructor)

	// 메소드 선언 ------------------
	//setter/getter 작성
	// 국어, 영어, 수학 점수가 변경되면 총점, 평균 재계산 처리
	// 국어, 영어, 수학 점수는 0~100까지 값만 입력처리	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			computeTotAvg();
		} else {
			System.out.println("[예외] 국어점수 0~100 아님 ");
		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
			computeTotAvg();
		} else {
			System.out.println("[예외] 영어점수 0~100 아님 ");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
			computeTotAvg();
		} else {
			System.out.println("[예외] 수학점수 0~100 아님 ");
		}
	}

	public int getTot() {
		return tot;
	}

//	public void setTot(int tot) {
//		this.tot = tot;
//	}

	public double getAvg() {
		return avg;
	}

//	public void setAvg(double avg) {
//		this.avg = avg;
//	}	
	
	//computeTotAvg() 추가 : tot, avg 값 재계산 처리
	public void computeTotAvg() {
		this.tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
	//printData() : 한사람의 데이타 화면 출력(간격은 탭 적용)
	public void printData() {
		System.out.println(name + "\t" 
				+ kor + "\t" + eng + "\t" + math + "\t"
				+ tot + "\t"+ avg);
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]\n";
	}

//	@Override
//	public String toString() {
//		return "(" + name + ", " + avg + ")";
//		
//	}
	
	
	
	
}





