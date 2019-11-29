package com.mtstudy.ex01_bean;
/* 자바빈(Java Bean)
   -멤버변수(property)의 접근제한자(제어자) private 선언
   -멤버변수(property)마다 get/set 매소드 제공(선택적으로 사용)
   -get/set 매소드는 public 으로 선언
   -set매소드는 하나 이상의 파라미터가 존재,get매소드는 파리미터가 없다
   -외부에서 멤버변수(property)접근시에는 get/set매소드를 통해서 사용
 
 */

public class Student extends Object {//extends Object: 생략된거다
	private String name; //이름,접근제한자 선언 안했으면 디폴트된다. private 선언
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//생성자 영역--------------------------
	public Student() {
		//super : 부모클래스(super클래스)를 의미
		//supper() : 부모클래스의 기본 생성자 호출
		super(); //생략하면 컴파일러가 자동 삽입해서 처리
	}
	
	public Student(String name) {
		//super();//작성 안하면 맨 첫줄에 super는 생략됨 - 부모클래스의 생성자 호출
		this.name=name;
	}
	
	public Student(String name, int kor, int eng, int math) {
		//현재 객체의 생성자 호출(String 데이타 하나 전달)
		//생성자 재사용
		this(name); //생성자 호출
		
		//this.name=name;
		//this.kor=kor; // 전달받은 값 그대로 필드에 저장
		this.setKor(kor); // 값 체클르 위한 setter 호출 처리
		//this.eng=eng;
		this.setEng(eng);
		this.math=math;
		
		computeAvg();//tot, avg 계산 처리
	}
	
	
	public Student(String name, int kor, int eng, int math, int tot, double avg) {
		super(); //constructer using 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}

	//매소드 영역--------------------------
	//매소드 장점: 필드에 바로 세팅하면 걸러낼수 있는 방법이 어려우나
	//          매소드를 사용하면 값체크를 바로 할수 있다
	//명칭 : set매소드, setter, set property
	public void setName(String name) {//필드값 가져다가 사용한다 첫글자 대문자 예:setName)
		this.name=name;//this:현재객체
	}
	
	//명칭 : get매소드, getter, get property
	public String getName() {
		return this.name;
	}
	
	//kor에 대한 setter/getter
	public void setKor(int kor) {
		if(kor>=0 && kor<=100) {
			this.kor=kor;
		}else {
			System.out.println("[예외kor] 0~100 범위가 아님 : " + kor);
		}
		
	}
	
	public int getKor() {
		return this.kor;
	}
	
	//eng에 대한 setter/getter
	public void setEng(int eng) {
		if(eng<0 || eng>100) {//비정상인 경우
			System.out.println("[예외eng] 0~100 범위가 아님 : " + eng);
			return; //매소드 종료, 권장하지 않음
		}
		this.eng=eng;
	}
	public int getEng() {
		return this.eng;
	}
	
	//math에 대한 setter/getter
	public void setMath(int math) {
		if(math>=0 && math<=100) {
			this.math=math;
		}else {
			System.out.println("[예외math] 0~100 범위가 아님 : " + math);
		}
	}
	public int getMath() {
		return this.math;
	}
	
	//tot(총점)에 대한 setter/getter
	//선택적으로 setter 제공안함
//	public void setTot(int kor, int eng, int math) {//필드값 가져다가 사용한다 첫글자 대문자 예:setName)
//		this.tot=kor+eng+math;//this:현재객체
//	}
	public void computeTot() {
		this.tot=kor+eng+math;
	}
	
	public int getTot() {
		return this.tot;
	}
	
	//avg(평군)에 대한 setter/getter
	//선택적으로 setter 제공안함
//	public void setAvg(double avg) {
//		this.avg=avg;
//	}
	public void computeAvg() {
		computeTot();
		this.avg = tot*100 / 3 / 100.0;
	}
	
	public double getAvg() {
		return this.avg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot + ", avg="
				+ avg + "]";
	}
	
	
	

}













