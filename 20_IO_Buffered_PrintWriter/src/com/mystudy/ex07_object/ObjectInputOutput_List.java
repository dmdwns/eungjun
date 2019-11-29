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
		// StudentVO 객체들을 List에 담아서 파일에 저장하고
		// 파일에서 읽어들인 List에 담긴 데이터를 화면에 출력
		File file=new File("file/object_io_list.txt");
		System.out.println(">>>저장할 데이터");
		StudentVO stu1 = new StudentVO("19001", "홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("19002", "김유신", 95, 90, 85);
		StudentVO stu3 = new StudentVO("19003", "김응준", 100, 100, 100);
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
		
		//[실습] Arraylist 타입의 객체 list를 파일에 저장하고
		//파일에 저장된 데이터를 읽어들여서 list에 저장된 학생 정보를 화면 출력
		//화면 출력시 toString() 사용하지 말고 필드값 추출해서 직접 화면 출력
		
		//내코드
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
//			System.out.println(">>> 파일에 쓰기(ObjectOutputStream) 사용");
//			oos.writeObject(list);
//			
//			System.out.println(">>파일에 쓰기 성공!!!");
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("[IOException] 파일에쓰기 실패");
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
//			System.out.println("--- 파일에서 읽어서 화면 출력 ---");
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
		
		//선생님 코드
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null; 
		
		try {
			//파일에 쓰고
			System.out.println(">>> 파일에 쓰기");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);//2명의 StudentVO 객체가 저장
			oos.close();
			
			//파일에서 읽기
			System.out.println(">>> 파일에서 읽기");
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
		
			
		
		
		




























