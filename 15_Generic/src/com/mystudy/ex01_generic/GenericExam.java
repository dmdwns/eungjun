package com.mystudy.ex01_generic;

//일반클래스
class Box extends Object {
	Object obj; //필드(멤버) 변수의 타입 Object
	void setObj(Object obj) { this.obj = obj; }
	Object getObj() { return obj; }
}

//제네릭 적용된 클래스
class BoxG<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return obj; }
}

public class GenericExam {

	public static void main(String[] args) {
		// 제네릭(Generic) : 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체타입을 의미
		// 제네릭 형태 : <객체자료형>, <>
		// API -> <T> : 객체자료형, <E> : 하나의 요소(즉 객체 하나를 의미)
		//      Map형식 : <K, V> K는 Key(키), V는 Value(값, 데이터)
		//-------------------------
		// 컬렉션(Collection) 프레임워크 : 객체들을 모아서 처리할 때 정해진 
		//       인터페이스와 클래스를 사용해서 작업  
		//   Set<E>, List<E>, Queue<E>, Map<K,V>, Stack<E>
		Box box = new Box();
		box.setObj("문자열 String");
		box.setObj(100);
		box.setObj(new Box());
		box.setObj(new Integer(1000));
		
		System.out.println(box.getObj());
		Integer integer = (Integer) box.getObj();
		System.out.println(integer.MAX_VALUE);
		
		int str = 333;
		String str2 = "Hello Java";
		
		System.out.println("---- 제네릭 사용 ----");
		BoxG<String> boxg = new BoxG<String>();
		boxg.setObj("문자열 String");
		boxg.setObj(str2);
		//boxg.setObj(str); //타입이 맞지 않으면 컴파일 오류 발생
		
		String obj = boxg.getObj(); //형변환 필요 없음
	}
}

/*
class BoxG<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return obj; }
}
 */






