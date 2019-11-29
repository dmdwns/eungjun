package com.mtstudy.ex01_bean;
/* �ڹٺ�(Java Bean)
   -�������(property)�� ����������(������) private ����
   -�������(property)���� get/set �żҵ� ����(���������� ���)
   -get/set �żҵ�� public ���� ����
   -set�żҵ�� �ϳ� �̻��� �Ķ���Ͱ� ����,get�żҵ�� �ĸ����Ͱ� ����
   -�ܺο��� �������(property)���ٽÿ��� get/set�żҵ带 ���ؼ� ���
 
 */

public class Student extends Object {//extends Object: �����ȰŴ�
	private String name; //�̸�,���������� ���� �������� ����Ʈ�ȴ�. private ����
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//������ ����--------------------------
	public Student() {
		//super : �θ�Ŭ����(superŬ����)�� �ǹ�
		//supper() : �θ�Ŭ������ �⺻ ������ ȣ��
		super(); //�����ϸ� �����Ϸ��� �ڵ� �����ؼ� ó��
	}
	
	public Student(String name) {
		//super();//�ۼ� ���ϸ� �� ù�ٿ� super�� ������ - �θ�Ŭ������ ������ ȣ��
		this.name=name;
	}
	
	public Student(String name, int kor, int eng, int math) {
		//���� ��ü�� ������ ȣ��(String ����Ÿ �ϳ� ����)
		//������ ����
		this(name); //������ ȣ��
		
		//this.name=name;
		//this.kor=kor; // ���޹��� �� �״�� �ʵ忡 ����
		this.setKor(kor); // �� üŬ�� ���� setter ȣ�� ó��
		//this.eng=eng;
		this.setEng(eng);
		this.math=math;
		
		computeAvg();//tot, avg ��� ó��
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

	//�żҵ� ����--------------------------
	//�żҵ� ����: �ʵ忡 �ٷ� �����ϸ� �ɷ����� �ִ� ����� ����쳪
	//          �żҵ带 ����ϸ� ��üũ�� �ٷ� �Ҽ� �ִ�
	//��Ī : set�żҵ�, setter, set property
	public void setName(String name) {//�ʵ尪 �����ٰ� ����Ѵ� ù���� �빮�� ��:setName)
		this.name=name;//this:���簴ü
	}
	
	//��Ī : get�żҵ�, getter, get property
	public String getName() {
		return this.name;
	}
	
	//kor�� ���� setter/getter
	public void setKor(int kor) {
		if(kor>=0 && kor<=100) {
			this.kor=kor;
		}else {
			System.out.println("[����kor] 0~100 ������ �ƴ� : " + kor);
		}
		
	}
	
	public int getKor() {
		return this.kor;
	}
	
	//eng�� ���� setter/getter
	public void setEng(int eng) {
		if(eng<0 || eng>100) {//�������� ���
			System.out.println("[����eng] 0~100 ������ �ƴ� : " + eng);
			return; //�żҵ� ����, �������� ����
		}
		this.eng=eng;
	}
	public int getEng() {
		return this.eng;
	}
	
	//math�� ���� setter/getter
	public void setMath(int math) {
		if(math>=0 && math<=100) {
			this.math=math;
		}else {
			System.out.println("[����math] 0~100 ������ �ƴ� : " + math);
		}
	}
	public int getMath() {
		return this.math;
	}
	
	//tot(����)�� ���� setter/getter
	//���������� setter ��������
//	public void setTot(int kor, int eng, int math) {//�ʵ尪 �����ٰ� ����Ѵ� ù���� �빮�� ��:setName)
//		this.tot=kor+eng+math;//this:���簴ü
//	}
	public void computeTot() {
		this.tot=kor+eng+math;
	}
	
	public int getTot() {
		return this.tot;
	}
	
	//avg(��)�� ���� setter/getter
	//���������� setter ��������
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













