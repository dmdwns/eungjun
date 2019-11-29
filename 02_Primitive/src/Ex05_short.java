
public class Ex05_short {

	public static void main(String[] args) {
		// 정수형 short : 2 byte(갯수: 65536, 범위 : -32768 ~ 32767)
		short short1 = 20000;
		short short2 = 30000;
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
		
		//표현범위를 벗어나면 원치않는 결과값을 가짐
		short sum = (short)(short1 + short2);
		System.out.println("short sum : " + sum);
		
		int sumInt = short1 + short2;
		System.out.println("int sumInt : " + sumInt);
		
		System.out.println("---- short 타입 최소, 최대값 ---");
		System.out.println("short 최소값 : " + Short.MIN_VALUE);
		System.out.println("short 최대값 : " + Short.MAX_VALUE);
	}

}



