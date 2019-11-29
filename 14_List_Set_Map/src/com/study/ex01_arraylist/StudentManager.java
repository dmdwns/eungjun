package com.study.ex01_arraylist;


import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

	public static void main(String[] args) {
		/*3���� ���� ó��
		������, 100,90,81
		������, 95,88,82
		������, 90,86,77
		===============
		������(�Ǹ�ŭ ���� ó��)
		��) ������	100	90	81	271	90.33
		       ������95	88	92	275	91.66
		       ������90	87	77	254	84.66
		 */
		//������ 'Ÿ�� ����' �ϴ°� �Ϲ����̴�
		//StudentVO -> VO�µ����͸� �����ؼ� ����ϱ� ���� �뵵
		StudentVO stu  = new StudentVO("������",100,90,81);
		StudentVO stu1 = new StudentVO("������",95,88,82);
		StudentVO stu2 = new StudentVO("������",90,87,77);
		
		System.out.println("----- ArrayList_����ȯ �̿�");
		ArrayList list=new ArrayList();
		//list.add(new StudentVO("������",90,87,77)); -> ������ ��ü ����
		list.add(stu); //������ ����� StudentVO ��ü�� ����
		list.add(stu1);
		list.add(stu2);
		
		//����ȯ ó��
		
//		Object obj=list.get(0);
//		StudentVO vo1=(StudentVO)obj;
//		vo1.printData();
//		���� A=B=C --> A=B, A=C		
		
		//����ȯ ���1
//		StudentVO obj1=(StudentVO)list.get(0); //(StudentVO)list�� �̿��ؼ� 
//		StudentVO obj2=(StudentVO)list.get(1);
//		StudentVO obj3=(StudentVO)list.get(2);
//		
//		obj1.printData();
//		obj2.printData();
//		obj3.printData();//���� �żҵ� �̿�� xx.printData()
		
		//����ȯ ���2.1 for�� �̿�
		//list�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
		//Object obj = list.get(0);
//		StudentVO vo = null;
//			vo = (StudentVO) list.get(0);
//			vo.printData();
//				
//			vo = (StudentVO) list.get(1);
//			vo.printData();
//				
//			vo = (StudentVO) list.get(2);
//			vo.printData();

//		for(int i=0; i<list.size(); i++) {
//			StudentVO svo=(StudentVO) list.get(i);
//			svo.printData();
//		}
		
		//����ȯ ���2.2 ������ for��
		for(Object obj : list) {
			StudentVO svo=(StudentVO) obj;
			svo.printData();
		}
		
		
		
		
		
		//�������̵� �ȵ������� objectŸ�� ���� �����´�
		System.out.println("----- ArrayList_�����żҵ� ȣ�� -----");
		printData(list);
		
		
		System.out.println("----- ArrayList_<StudentVO> �̿� -----");
		//���ʸ�(Generic) ����
		ArrayList<StudentVO> list2 = new ArrayList<StudentVO>(); //�� ���� �ȿ��� ��������
//		StudentVO StudentVO1=new StudentVO("������", 100, 90, 81);
//		StudentVO StudentVO2=new StudentVO("������", 95, 88, 82);
//		StudentVO StudentVO3=new StudentVO("������", 90, 87, 77);
//		StudentVO1.printData();
//		StudentVO2.printData();
//		StudentVO3.printData();
		
		//list2.add(stu);
		//list2.get(0).printData();
		
		list2.add(stu);
		list2.add(stu1);
		list2.add(stu2);
		
		//3.1for��
		StudentVO Stu = list2.get(0);
		stu.printData();
		for(int i=0; i<list2.size(); i++) {
			StudentVO svo=list2.get(i);
			svo.printData();
		}
		
		//3.2������ for��
		for(StudentVO svo : list2) {
			String name=svo.getName();
			double avg = svo.getAvg();
			System.out.println(name + ", " + avg);
			//System.out.println(svo.getName() + ", " + svo.getAvg());
		}
		
		
	}
	//�żҵ� �����
	static void printData(List list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
	}
	

}






























