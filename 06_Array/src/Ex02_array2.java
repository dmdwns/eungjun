
public class Ex02_array2 {

	public static void main(String[] args) {
		/* 문제 : 1~10까지의 수를 배열에 저장(반복문사용)하고
		         배열에 있는 데이타를 출력
		출력형태 : 변수명[인덱스번호] : 값
		num[0] : 1
		num[1] : 2
		------------------ */
		//int 타입 배열 선언(크기 10인)
		//      인덱스 0  1  2  3  4  5  6  7  8  9
		//int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num = new int[10];
		
		//배열에 값을 저장(1, 2, 3, ..., 9, 10) - 반복문사용
		//num[0] = 1;
		//num[1] = 2;
		//num[2] = 3;
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		//배열에 있는 값(데이타) 출력 -반복문사용
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] : " + num[i]);
		}
		//----------------------------
		System.out.println("======================");
		//배열의 초기화
		for (int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
		
		//5개의 데이타를 저장 (11~15) 저장 하고 출력
		int value = 11;
		for (int i = 0; i < 5; i++) {
			num[i] = value;
			value++;
		}
		
		//배열에 있는 값(데이타) 출력 -반복문사용
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] : " + num[i]);
		}
		dispData(num); //메소드 호출부 - num 인수, 매개변수 값
		
	}
	
	//메소드, 메서드(method)
	static void dispData(int[] arr) { //매개변수 int[] 전달 받음
		System.out.println("==== 배열 데이타 출력 ===");
		for (int i = 0; i < arr.length; i++) {
			System.out.println( i + " : " + arr[i]);
		}
		System.out.println("--------------------------");
	}
	
	

}






