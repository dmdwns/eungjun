
public class Ex07_long {

	public static void main(String[] args) {
		// 정수형 long : 8 byte
		// 범위 : 충분히 큰 수
		// long 타입값 명시적 표현 : 숫자 + L 또는 l(영문 대소문자 엘)
		long num1 = 20000000000L; //long 타입 접미어 사용
		long num2 = 30000000000l;
		long sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("-------------------------");

		System.out.println("--- long 타입 최소/최대값 ---");
		System.out.println("long 타입 최소값 : " + Long.MIN_VALUE);
		System.out.println("long 타입 최대값 : " + Long.MAX_VALUE);
		
		System.out.println("===== 타입 형변환 =====");
		byte numByte = 100; //1 byte
		short numShort = 3000; //2 byte
		int numInt = 3000000; //4 byte
		long numLong = 5000000000000000L; //8 byte
		
		numByte = (byte) numShort; //손실발생 가능성 있음
		System.out.println("numByte : " + numByte);
		
		numLong = numInt; //long타입 <- int타입 : 손실없이 저장
		System.out.println("numLong : " + numLong);
	}

}




