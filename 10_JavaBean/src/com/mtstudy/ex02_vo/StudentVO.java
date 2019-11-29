package com.mtstudy.ex02_vo;
/*�ڹٺ�(JavaBean) ������ Ŭ���� �ۼ�
  VO(Value Object): ���� �����ϱ� ���� Ŭ����(��ü)
  DTO(Data Transfer Object): ���� �����ؼ� �����ϱ� ���� Ŭ����(��ü)
  XxxxVO, XxxxVo, XxxxDTO, XxxxDto 
 */


public class StudentVO {
	//�ʵ弱��---------------
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private int tot;
	private double avg;

	//������ ����-------------
	//������ : ����, ����, ����, ���� ������ �Է¹޴� ������
	//����, ��� �� �ڵ� ��� ó��
	public StudentVO(String name, int kor, int eng, int math) {
		//����, ����, ����, ���� �Է¹޴� ������
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		//����, ��� �� �ڵ� ��� ó��
		computeToAvg();
		
	}


	//�żҵ� ����-------------
	//setter, getter �ۼ�
	//����, ����, ���� ������ ����Ǹ� ����, ��� ���� ó��
	//����, ����, ���� ������ 0~100���� ���� �Է�ó��
	
	//name �� ���� setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//kor�� ���� setter/getter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(kor>=0 && kor<=100) {
			this.kor=kor;
			computeToAvg();
		}else {
			System.out.println("[����kor] 0~100 ������ �ƴ� : " + kor);
		}
		
	}

	//eng�� ����  setter/getter
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(eng>=0 && eng<=100) {
			this.eng=eng;
			computeToAvg();
		}else {
			System.out.println("[����eng] 0~100 ������ �ƴ� : " + eng);
		}
	}

	//math�� ����  setter/getter
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math>=0 && math<=100) {
			this.math = math;
			computeToAvg();
		}else {
			System.out.println("[����math] 0~100 ������ �ƴ� : " + math);
		}
			
	}

	//tot�� ����  setter/getter
	public int getTot() {
		return tot;
	}

	public void computeTot() {
		this.tot=kor+eng+math;
	}

	//avg�� ����  setter/getter
	public double getAvg() {
		return avg;
	}

	//computeToAvg() �߰� : tot,avg �� ����ó��
	public void computeToAvg() {
		tot=kor+eng+math;
		avg=tot*100/3/100;//�Ҽ��� 2°�ڸ�
	}
	
	//printData():�ѻ���� ����Ÿ ȭ�� ���
	public void printData() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot
				+ "\t" + avg); //������� �� �Ը���� ���� ����
	}
	

}













