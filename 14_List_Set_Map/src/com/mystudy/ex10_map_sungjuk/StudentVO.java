package com.mystudy.ex10_map_sungjuk;
/* �ڹٺ�(JavaBean) ������ Ŭ���� �ۼ�
	VO(Value Object) : ���� �����ϱ� ���� Ŭ����(��ü)
	DTO(Data Transfer Object) : ���� �����ؼ� �����ϱ� ���� Ŭ����(��ü)
	-> XxxxVO, XxxxVo, XxxxDTO, XxxxDto
*/
public class StudentVO {
	// �ʵ弱�� -------------------
	private String name; // - name : String
	private int kor;
	private int eng; 
	private int math; 
	
	private int tot; 
	private double avg;
	
	// ������ ���� ------------------
	//������ : ����, ����, ����, ���� ������ �Է¹޴� ������
	//   ����, ��� �� �ڵ� ��� ó��
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	//public StudentVO() {} //�⺻������(default constructor)

	// �޼ҵ� ���� ------------------
	//setter/getter �ۼ�
	// ����, ����, ���� ������ ����Ǹ� ����, ��� ���� ó��
	// ����, ����, ���� ������ 0~100���� ���� �Է�ó��	
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
			System.out.println("[����] �������� 0~100 �ƴ� ");
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
			System.out.println("[����] �������� 0~100 �ƴ� ");
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
			System.out.println("[����] �������� 0~100 �ƴ� ");
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
	
	//computeTotAvg() �߰� : tot, avg �� ���� ó��
	public void computeTotAvg() {
		this.tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
	//printData() : �ѻ���� ����Ÿ ȭ�� ���(������ �� ����)
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





