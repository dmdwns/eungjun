package com.mystudy.jdbc_crud;
/* 자바빈(JavaBean) 형태의 클래스 작성
VO(Value Object) : 값을 저장하기 위한 클래스(객체)
DTO(Data Transfer Object) : 값을 저장해서 전달하기 위한 클래스(객체)
-> XxxxVO, XxxxVo, XxxxDTO, XxxxDto
*/
public class StudentVO {
	private String id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//생성자(id,name,kor,eng,math)
	public StudentVO(String id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	//생성자(id,name,kor,eng,math,tot,avg)
	public StudentVO(String id, String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}
	//메소드(getter/setter)

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
	//toString(오버라이딩)

	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot="
				+ tot + ", avg=" + avg + "]";
	}
}






