
public class Ex03_array3 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		dispData(nums);
		//-------------------
		//배열에 있는 값 중 짝수는 짝수끼리 합산(evenSum)
		//배열에 있는 값 중 홀수는 홀수끼리 합산(oddSum)
		//짝수합계, 홀수합계 값 출력
		int evenSum = 0; //짝수합계
		int oddSum = 0; //홀수합계
		
		boolean even = nums[0] % 2 == 0; //짝수인지 확인
		System.out.println(even);
		//짝수, 홀수 합계 구하기
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) { //짝수냐? - 짝수인 경우
				evenSum = evenSum + nums[i];
			} else { //홀수
				oddSum += nums[i];
			}
		}
		//출력
		System.out.println("홀수합계 : " + oddSum
				+ ", 짝수합계 : " + evenSum);
		//=========================================

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
