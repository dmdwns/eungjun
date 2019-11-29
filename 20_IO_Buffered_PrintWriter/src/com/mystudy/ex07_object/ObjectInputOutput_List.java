package com.mystudy.ex07_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class ObjectInputOutput_List {

	public static void main(String[] args) {
		// StudentVO ��ü���� List�� ��Ƽ� ���Ͽ� �����ϰ�
		// ���Ͽ��� �о���� List�� ��� �����͸� ȭ�鿡 ���
		File file=new File("file/object_io_list.txt");
		System.out.println(">>>������ ������");
		StudentVO stu1 = new StudentVO("19001", "ȫ�浿", 100, 90, 81);
		StudentVO stu2 = new StudentVO("19002", "������", 95, 90, 85);
		StudentVO stu3 = new StudentVO("19003", "������", 100, 100, 100);
		System.out.println("stu1 : " + stu1);
		System.out.println("stu2 : " + stu2);
		System.out.println("=====================================");
		
		ArrayList<StudentVO> list=new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		System.out.println("ArrayList<StudentVO> list : ");
		System.out.println(list);
		System.out.println("=====================================");
		
		//[�ǽ�] Arraylist Ÿ���� ��ü list�� ���Ͽ� �����ϰ�
		//���Ͽ� ����� �����͸� �о�鿩�� list�� ����� �л� ������ ȭ�� ���
		//ȭ�� ��½� toString() ������� ���� �ʵ尪 �����ؼ� ���� ȭ�� ���
		
		//���ڵ�
//		FileOutputStream fos=null;
//		ObjectOutputStream oos=null;
//		
//		FileInputStream fis = null;
//		ObjectInputStream ois = null;
//		
//		try {
//			fos=new FileOutputStream(file);
//			oos=new ObjectOutputStream(fos);
//			
//			System.out.println(">>> ���Ͽ� ����(ObjectOutputStream) ���");
//			oos.writeObject(list);
//			
//			System.out.println(">>���Ͽ� ���� ����!!!");
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("[IOException] ���Ͽ����� ����");
//		} finally {
//			try {
//				if(oos != null) oos.close();
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		
//		try {
//			fis=new FileInputStream(file);
//			ois=new ObjectInputStream(fis);
//			
//			System.out.println("--- ���Ͽ��� �о ȭ�� ��� ---");
//			
//			for(StudentVO svo : list) {
//				String name=svo.getName();
//				int kor=svo.getKor();
//				int eng=svo.getEng();
//				int math=svo.getMath();
//				int tot=svo.getTot();
//				double avg = svo.getAvg();
//				System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg);
//				
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		
//		} finally {
//			try {
//				if (ois != null) ois.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//������ �ڵ�
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null; 
		
		try {
			//���Ͽ� ����
			System.out.println(">>> ���Ͽ� ����");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);//2���� StudentVO ��ü�� ����
			oos.close();
			
			//���Ͽ��� �б�
			System.out.println(">>> ���Ͽ��� �б�");
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			//@SuppressWarnings("unchecked")
			//ArrayList<StudentVO> <=== Object
			ArrayList<StudentVO> list2 = (ArrayList<StudentVO>) ois.readObject();
			System.out.println(list2);
			
			System.out.println("--------------");
			for (int i = 0; i < list2.size(); i++) {
				StudentVO vo = list2.get(i);
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.print(vo.getMath() + "\t");
				System.out.print(vo.getTot() + "\t");
				System.out.print(vo.getAvg());
				System.out.println();
			}
			System.out.println("---------------");
			for (StudentVO vo : list2) {
				StringBuilder sb = new StringBuilder();
				sb.append(vo.getName() + "\t");
				sb.append(vo.getKor() + "\t");
				sb.append(vo.getEng() + "\t");
				sb.append(vo.getMath() + "\t");
				sb.append(vo.getTot() + "\t");
				sb.append(vo.getAvg());
				System.out.println(sb);
			}
			
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
		
			
		
		
		




























