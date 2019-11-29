package com.mystudy.ex01_generic;

//�Ϲ�Ŭ����
class Box extends Object {
	Object obj; //�ʵ�(���) ������ Ÿ�� Object
	void setObj(Object obj) { this.obj = obj; }
	Object getObj() { return obj; }
}

//���׸� ����� Ŭ����
class BoxG<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return obj; }
}

public class GenericExam {

	public static void main(String[] args) {
		// ���׸�(Generic) : �÷����� � ��ü��� �̷�������� ǥ���ϴ� ��üŸ���� �ǹ�
		// ���׸� ���� : <��ü�ڷ���>, <>
		// API -> <T> : ��ü�ڷ���, <E> : �ϳ��� ���(�� ��ü �ϳ��� �ǹ�)
		//      Map���� : <K, V> K�� Key(Ű), V�� Value(��, ������)
		//-------------------------
		// �÷���(Collection) �����ӿ�ũ : ��ü���� ��Ƽ� ó���� �� ������ 
		//       �������̽��� Ŭ������ ����ؼ� �۾�  
		//   Set<E>, List<E>, Queue<E>, Map<K,V>, Stack<E>
		Box box = new Box();
		box.setObj("���ڿ� String");
		box.setObj(100);
		box.setObj(new Box());
		box.setObj(new Integer(1000));
		
		System.out.println(box.getObj());
		Integer integer = (Integer) box.getObj();
		System.out.println(integer.MAX_VALUE);
		
		int str = 333;
		String str2 = "Hello Java";
		
		System.out.println("---- ���׸� ��� ----");
		BoxG<String> boxg = new BoxG<String>();
		boxg.setObj("���ڿ� String");
		boxg.setObj(str2);
		//boxg.setObj(str); //Ÿ���� ���� ������ ������ ���� �߻�
		
		String obj = boxg.getObj(); //����ȯ �ʿ� ����
	}
}

/*
class BoxG<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return obj; }
}
 */






