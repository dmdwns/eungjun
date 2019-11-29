package com.mystudy.ex03_sungjuk;

public class StudentVO {
	//�ʵ�(�Ӽ�)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//������ �����(�ǽ�)
	//�⺻������
	//name, kor, eng, math ���� ���� �޴� ������
	//��ü �ʵ尪�� �޴� ������
	public StudentVO() {}
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public StudentVO(String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}
	
	//�޼ҵ� �����(�ǽ�) : getter, setter �����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	//�� üũ
	public boolean setKor(int kor) {
		boolean result = true;
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
		} else {
			//System.out.println("[���ܹ߻�] ����(0~100) ���");
			result = false;
		}
		return result;
	}
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) throws JumsuOutOfValueException {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
		} else {
			//System.out.println("[���ܹ߻�] ����(0~100) ���");
			throw new JumsuOutOfValueException(); //���� �߻���Ű��
		}
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
	//toString() �ۼ� : �������̵�
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}
	
	
}









