package com.mtstudy.ex01_bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		//stu.name = "ȫ�浿";
		//System.out.println(stu.name);//����Ʈ�϶�,private�����ϸ� ���� �ȵ�
		stu.setName("ȫ�浿2");
 	   	System.out.println("�̸� : " + stu.getName());
 	   	
 	   	System.out.println("----- set/get�żҵ� �̿� ��,��,��,����,��� ���� ��� -----");
 	   	
 	   	stu.setKor(83);
 	    stu.setEng(97);
 	    stu.setMath(100);
 	   	System.out.println("�������� : " + stu.getKor());
 	   	System.out.println("�������� : " + stu.getEng());
 	   	System.out.println("�������� : " + stu.getMath());
 	   	stu.computeAvg();
 	   	System.out.println("���� : " + stu.getTot());
 	   	System.out.println("��� : " + stu.getAvg());
 	   	
 	    //===============================================
 	   	
 	   	System.out.println("----- ������ �̿�01 ------");
 	   	Student stu2 = new Student("�趯", 84, 101, 100);//��Ʈ�� + �����̽� : ������
 	    System.out.println("�̸� : " + stu2.getName());
 	   	System.out.println("�������� : " + stu2.getKor());
	   	System.out.println("�������� : " + stu2.getEng());
	   	System.out.println("�������� : " + stu2.getMath());
	   	System.out.println("���� : " + stu2.getTot());
	   	System.out.println("��� : " + stu2.getAvg());
	   	
	   	System.out.println("----- ������ �̿�02 ------");
	   	System.out.println(stu2.toString());
	
	
	
	
	}
	
	

}


















