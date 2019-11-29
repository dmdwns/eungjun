
public class Ex01_array {
    
	public static void main(String[] args) {
		/* 배열(Array) : 동일한 데이타타입의 데이타를 동일한 변수명으로 사용
		배열의 선언 : 자료형[] 변수명
		변수에 값 저장 : 배열변수명[인덱스번호] = 값;
		<배열의 선언 및 생성>
		1. 자료형[] 변수명 = new 자료형[갯수];
		     자료형 변수명[] = new 자료형[갯수];
		2. 자료형[] 변수명 = new 자료형[] {값1, 값2, ..., 값n};
		3. 자료형[] 변수명 = {값1, 값2, ..., 값n}; //n개의 저장공간 생성
		*/
		int[] arr = new int[7]; //int타입 데이타 6개 저장 공간 생성
		System.out.println("arr : " + arr);
		System.out.println("arr[0] : " + arr[0]);
		arr[0] = 100; //int타입 arr 배열의 첫번째 위치(0번 인덱스)
		System.out.println("arr[0] : " + arr[0]);
		arr[1] = 200; //두번째, 1번 인덱스
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		arr[5] = 600; 
		arr[6] = 700; //마지막 데이타(배열의 크기 - 1 위치)
		//arr[6] = 700; //실행시 ArrayIndexOutOfBoundsException 예외발생
		//System.out.println("arr[6] : " + arr[6]);
		
		int sum = 0; //배열에 있는 값의 합계 저장
		sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5]
				+ arr[6];
		System.out.println("sum : " + sum);
		System.out.println("----------");
		
		//------------------------
		
		//    인덱스시작값        배열크기값
		for (int i = 0; i < 6; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println("----------");
		
		//반복문을 사용하여 배열값 합계 구하기
		sum = 0;
		for (int idx = 0; idx < 6; idx++) {
			sum = sum + arr[idx];
		}
		System.out.println("배열값 합계(sum) : " + sum);
		
		//======================================
		//배열의 크기 확인(조회)
		System.out.println("arr.length : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println("=====================");
		System.out.println("==== 영어 알파벳 출력(A~Z) =====");
		char[] ch = new char[26];
		ch[0] = 'A';
		System.out.println("ch[0] : " + ch[0]);
		ch[1] = 'B';
		System.out.println("ch[1] : " + ch[1]);
		ch[2] = 'B' + 1;
		System.out.println("ch[2] : " + ch[2]);
		
		System.out.println("----------------");
		//ch 배열에 알파벳('A' ~ 'Z') 저장방식 자동화
		ch[0] = 'A' + 0;
		ch[1] = 'A' + 1; //B
		ch[2] = 'A' + 2; //C
		ch[3] = 'A' + 3; //D
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('A' + i);
		}
		
		//배열에 저장된 값 출력
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		
		//==================================
		System.out.println("--- 배열선언형태 2번 -----");
		//배열의 크기와 초기값 설정을 한 번에 처리
		int[] num = new int[] {100, 101, 102, 103, 104};
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("--- 배열 선언 형태 3번 ---");
		int[] arr3 = {10, 11, 12, 13, 14, 15};
		System.out.println("arr3.length : " + arr3.length);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}










