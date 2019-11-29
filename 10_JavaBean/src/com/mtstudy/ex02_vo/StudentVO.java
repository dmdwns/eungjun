package com.mtstudy.ex02_vo;
/*자바빈(JavaBean) 형태의 클래스 작성
  VO(Value Object): 값을 저장하기 위한 클래스(객체)
  DTO(Data Transfer Object): 값을 저장해서 전달하기 위한 클래스(객체)
  XxxxVO, XxxxVo, XxxxDTO, XxxxDto 
 */


public class StudentVO {
	//필드선언---------------
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private int tot;
	private double avg;

	//생성자 선언-------------
	//생성자 : 성명, 국어, 영어, 수학 점수를 입력받는 생성자
	//총점, 평균 값 자동 계산 처리
	public StudentVO(String name, int kor, int eng, int math) {
		//성명, 국어, 영어, 수학 입력받는 생성자
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		//총점, 평균 값 자동 계산 처리
		computeToAvg();
		
	}


	//매소드 선언-------------
	//setter, getter 작성
	//국어, 영어, 수학 점수가 변경되면 총점, 평균 재계산 처리
	//국어, 영어, 수학 점수는 0~100까지 값만 입력처리
	
	//name 에 대한 setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//kor에 대한 setter/getter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(kor>=0 && kor<=100) {
			this.kor=kor;
			computeToAvg();
		}else {
			System.out.println("[예외kor] 0~100 범위가 아님 : " + kor);
		}
		
	}

	//eng에 대한  setter/getter
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(eng>=0 && eng<=100) {
			this.eng=eng;
			computeToAvg();
		}else {
			System.out.println("[예외eng] 0~100 범위가 아님 : " + eng);
		}
	}

	//math에 대한  setter/getter
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math>=0 && math<=100) {
			this.math = math;
			computeToAvg();
		}else {
			System.out.println("[예외math] 0~100 범위가 아님 : " + math);
		}
			
	}

	//tot에 대한  setter/getter
	public int getTot() {
		return tot;
	}

	public void computeTot() {
		this.tot=kor+eng+math;
	}

	//avg에 대한  setter/getter
	public double getAvg() {
		return avg;
	}

	//computeToAvg() 추가 : tot,avg 값 재계산처리
	public void computeToAvg() {
		tot=kor+eng+math;
		avg=tot*100/3/100;//소숫점 2째자리
	}
	
	//printData():한사람의 데이타 화면 출력
	public void printData() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot
				+ "\t" + avg); //출력위해 내 입맛대로 변형 가능
	}
	

}













