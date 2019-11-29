package com.mystudy.ex01_bean;
/* �ڹٺ�(Java Bean)
	- �������(property)�� ����������(������) private ����
	- �������(property) ���� get/set �޼ҵ� ����(������ ���)
	- get/set �޼ҵ�� public ���� ����
	- get �޼ҵ� �Ķ���� ����, set �޼ҵ�� �ϳ� �̻��� �Ķ���� ����
	- �ܺο��� �������(property) ���ٽÿ��� get/set �޼ҵ带 ���� ����(���)
*/
class Student extends Object {
	private String name; //
	private int kor;
	private int eng; //setter/getter �ۼ�
	private int math; //setter/getter �ۼ�
	
	private int tot; //setter/getter �ۼ�
	private double avg; //setter/getter �ۼ�
	
	//������ ���� -------------------------
	public Student() {
		//super : �θ�Ŭ����(super Ŭ����)�� �ǹ�
		//super() : �θ�Ŭ������ �⺻ ������ ȣ��
		super(); //�����ϸ� �����Ϸ��� �ڵ� �����ؼ� ó��
	}
	
	public Student(String name) {
		//super(); //�� ù �ٿ� �ۼ� - �θ�Ŭ������ ������ ȣ��
		this.name = name;
	}
	
	public Student(String name, int kor, int eng, int math) {
		//���� ��ü�� ������ ȣ��(String ����Ÿ �ϳ� ����)
		//������ ����
		//this(name); //������ ȣ��
		
		this.name = name;
		//this.kor = kor; //���޹��� �� �״�� �ʵ忡 ����
		setKor(kor); //�� üũ�� ���� setter ȣ�� ó��
		//this.eng = eng;
		setEng(eng);//�� üũ�� ���� setter ȣ�� ó��
		this.math = math;
		
		computeAvg(); //tot, avg ��� ó��
	}
	
	public Student(String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}

	//�޼ҵ� ���� ------------------------
	//��Ī : set�޼ҵ�, setter, set property
	public void setName(String name) {
		this.name = name;
	}
	
	//��Ī : get�޼ҵ�, getter, get property
	public String getName() {
		return this.name;
	}
	
	//kor�� ���� setter/getter
	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
		} else {
			System.out.println("[����kor] 0~100 ������ �ƴ� -" + kor);
		}
		
	}
	public int getKor() {
		return this.kor;
	}

	//-----------------------------------
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng < 0 || eng > 100) { //�������� ���
			System.out.println("[����eng] 0~100 ������ �ƴ� -" + eng);
			return; //�޼ҵ� ���� ó��
		}
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
	
	//���������� setter ���� ����
//	public void setTot(int tot) {
//		this.tot = tot;
//	}

	public void computeTot() {
		this.tot = kor + eng + math;
	}
	
	public double getAvg() {
		return avg;
	}

	//���������� setter ���� ����
//	public void setAvg(double avg) {
//		this.avg = avg;
//	}
	
	public void computeAvg() {
		computeTot();
		this.avg = tot * 100 / 3 / 100.0;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot + ", avg="
				+ avg + "]";
	}
	
	
	
	
}










