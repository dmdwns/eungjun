
public class Ex04_byte {

	public static void main(String[] args) {
		// 정수형 byte : 정수 숫자 256종류(-128 ~ 127)
		byte byte1 = 100;
		byte byte2 = 29;
		
		System.out.println("byte1 : " + byte1);
		System.out.println("byte2 : " + byte2);

		//연산결과 값이 저장범위(표현범위) 벗어나면 예상치 못한 쓰레기 값이 됨
		byte byte3 = (byte)(byte1 + byte2);
		System.out.println("byte1 + byte2 : " + byte3);
		
		//------------------
		System.out.println("--- byte 최소, 최대값 ---");
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE);
	}

}




