package com.mystudy.ex07_object;

import java.io.Serializable;

//Serializable 인터페이스 : 데이터 전송을 위한 Object를 만들 때
//    Serializable 인터페이스를 구현해 주어야 전송할 수 있는 데이터 타입이 됨
//전송에서 제외되는 데이터
// - transient 처리된 필드
// - static 필드
public class StudentVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	transient private String id; //transient : 전송제외
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public StudentVO(String id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot="
				+ tot + ", avg=" + avg + "]";
	}
	public void computeTotAvg() {
		tot = kor + eng + math;
		avg = (tot * 100) / 3 / 100.0;
	}
	
}












