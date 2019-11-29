
public class Ex08_float {

	public static void main(String[] args) {
		// 실수형 float : 4 byte
		// 소수점 이하 데이타 저장 가능
		// 표시형식 : 숫자.숫자 + f 또는 F
		// 소수점이하 6자리 까지의 정확도 유지
		float f1 = 3.4f;
		float f2 = 3.2F;
		System.out.println("float 3.4f : " + f1);
		System.out.println("float 3.2f : " + f2);
		System.out.println("3.4f + 3.2f : " + (f1 + f2));
		
		System.out.println("3.4f + 3.1f : " + (3.4f + 3.1f));
		
		System.out.println("--- float 타입 최소/최대값 ---");
		System.out.println("float 최소값 : " + Float.MIN_VALUE);
		System.out.println("float 최대값 : " + Float.MAX_VALUE);
		
		float f3 = 1123456789012345f;
		System.out.println("1123456789012345f : " + f3);

	}

}





