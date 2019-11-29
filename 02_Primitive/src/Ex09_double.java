
public class Ex09_double {

	public static void main(String[] args) {
		// 실수형 double : 8 byte
		// 표시형식 : 숫자.숫자   / 숫자.숫자 + D 또는 d
		double d1 = 1.1;
		double d2 = 1.12345678901234567890d;
		System.out.println("double 1.1 : " + d1);
		System.out.println("double 1.12345678901234567890d : " + d2);
		
		double sum = d1 + d2;
		System.out.println("d1 + d2 : " + sum);
		
		System.out.println("3.4f + 3.2f : " + (3.4f + 3.2f));
		System.out.println("3.4d + 3.2d : " + (3.4d + 3.2d));
		
		System.out.println("=========================");
		float f1 = 3.4f;
		d1 = f1; //double <- float : 자동형변환
		
		//정수형 <-> 실수형 : 자동형변환 결정여부는 표현범위
		//int, long -> float, double : 자동형변환 가능하나 하지 말것
	}

}






