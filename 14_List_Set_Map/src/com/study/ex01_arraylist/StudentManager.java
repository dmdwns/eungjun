package com.study.ex01_arraylist;


import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

	public static void main(String[] args) {
		/*3명의 성적 처리
		김응준, 100,90,81
		김응순, 95,88,82
		김응도, 90,86,77
		===============
		결과출력(탭만큼 간격 처리)
		예) 김응준	100	90	81	271	90.33
		       김응순95	88	92	275	91.66
		       김응도90	87	77	254	84.66
		 */
		//이제는 '타입 지정' 하는게 일반적이다
		//StudentVO -> VO는데이터를 저장해서 사용하기 위한 용도
		StudentVO stu  = new StudentVO("김응준",100,90,81);
		StudentVO stu1 = new StudentVO("김응순",95,88,82);
		StudentVO stu2 = new StudentVO("김응도",90,87,77);
		
		System.out.println("----- ArrayList_형변환 이용");
		ArrayList list=new ArrayList();
		//list.add(new StudentVO("김응도",90,87,77)); -> 생성한 객체 저장
		list.add(stu); //변수에 저장된 StudentVO 객체를 저장
		list.add(stu1);
		list.add(stu2);
		
		//형변환 처리
		
//		Object obj=list.get(0);
//		StudentVO vo1=(StudentVO)obj;
//		vo1.printData();
//		원리 A=B=C --> A=B, A=C		
		
		//형변환 방법1
//		StudentVO obj1=(StudentVO)list.get(0); //(StudentVO)list를 이용해서 
//		StudentVO obj2=(StudentVO)list.get(1);
//		StudentVO obj3=(StudentVO)list.get(2);
//		
//		obj1.printData();
//		obj2.printData();
//		obj3.printData();//상위 매소드 이용시 xx.printData()
		
		//형변환 방법2.1 for문 이용
		//list에 있는 데이타를 사용해서 화면출력
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
		
		//형변환 방법2.2 개선된 for문
		for(Object obj : list) {
			StudentVO svo=(StudentVO) obj;
			svo.printData();
		}
		
		
		
		
		
		//오버라이드 안되있으면 object타입 에서 가져온다
		System.out.println("----- ArrayList_하위매소드 호출 -----");
		printData(list);
		
		
		System.out.println("----- ArrayList_<StudentVO> 이용 -----");
		//제너릭(Generic) 적용
		ArrayList<StudentVO> list2 = new ArrayList<StudentVO>(); //뒷 꺽새 안에는 생략가능
//		StudentVO StudentVO1=new StudentVO("김응준", 100, 90, 81);
//		StudentVO StudentVO2=new StudentVO("김응순", 95, 88, 82);
//		StudentVO StudentVO3=new StudentVO("김응도", 90, 87, 77);
//		StudentVO1.printData();
//		StudentVO2.printData();
//		StudentVO3.printData();
		
		//list2.add(stu);
		//list2.get(0).printData();
		
		list2.add(stu);
		list2.add(stu1);
		list2.add(stu2);
		
		//3.1for문
		StudentVO Stu = list2.get(0);
		stu.printData();
		for(int i=0; i<list2.size(); i++) {
			StudentVO svo=list2.get(i);
			svo.printData();
		}
		
		//3.2개선된 for문
		for(StudentVO svo : list2) {
			String name=svo.getName();
			double avg = svo.getAvg();
			System.out.println(name + ", " + avg);
			//System.out.println(svo.getName() + ", " + svo.getAvg());
		}
		
		
	}
	//매소드 만들기
	static void printData(List list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
	}
	

}






























