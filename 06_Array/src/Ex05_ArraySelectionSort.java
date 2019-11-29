import java.util.Arrays;

public class Ex05_ArraySelectionSort {

	public static void main(String[] args) {
		// 배열에 저장된 숫자 정렬(오름차순 : ASC)
		// 30, 20, 50, 40, 10
		int[] num = {30, 20, 50, 40, 10};
		
		//데이타 확인
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
		
		System.out.print("원본데이타 : ");
		printData(num); //메소드 호출해서 배열 데이타 확인
		
		System.out.println("--- 정렬 시작 ---");
//		//첫번째 값 기준으로 두번째 값과 비교작업(인덱스 0 - 인덱스 1)
//		if (num[0] > num[1]) {
//			int temp = num[0]; //첫번째 데이타백업
//			num[0] = num[1]; //복사(0번 인덱스 <- 1번 인덱스값)
//			num[1] = temp; //백업 데이타 복사
//		}
//		printData(num);
//		
//		//첫번째 값 기준으로 세번째 값과 비교작업(인덱스 0 - 인덱스 2)
//		if (num[0] > num[2]) {
//			int temp = num[0];
//			num[0] = num[2];
//			num[2] = temp;
//		}
//		printData(num);
//		
//		//첫번째 값 기준으로 세번째 값과 비교작업(인덱스 0 - 인덱스 3)
//		if (num[0] > num[3]) {
//			int temp = num[0];
//			num[0] = num[3];
//			num[3] = temp;
//		}
//		printData(num);
//		
//		//첫번째 값 기준으로 세번째 값과 비교작업(인덱스 0 - 인덱스 4)
//		if (num[0] > num[4]) {
//			int temp = num[0];
//			num[0] = num[4];
//			num[4] = temp;
//		}
//		printData(num);
		
/*
		System.out.println(">> 반복문으로 전환 후");
		//첫번째 값을 기준 - 반복문으로 전환(기준값 인덱스 0번)
		for (int i = 1; i <= 4; i++) {
			if (num[0] > num[i]) {
				int temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			}
			printData(num);
		}
		
		System.out.println("---- 인덱스 1번 ----");
		//첫번째 값을 기준 - 반복문으로 전환(기준값 인덱스 1번)
		for (int i = 2; i <= 4; i++) {
			if (num[1] > num[i]) {
				int temp = num[1];
				num[1] = num[i];
				num[i] = temp;
			}
			printData(num);
		}
		
		System.out.println("---- 인덱스 2번 ----");
		//첫번째 값을 기준 - 반복문으로 전환(기준값 인덱스 2번)
		for (int i = 3; i <= 4; i++) {
			if (num[2] > num[i]) {
				int temp = num[2];
				num[2] = num[i];
				num[i] = temp;
			}
			printData(num);
		}
		
		System.out.println("---- 인덱스 3번 ----");
		//첫번째 값을 기준 - 반복문으로 전환(기준값 인덱스 3번)
		for (int i = 4; i <= 4; i++) {
			if (num[3] > num[i]) {
				int temp = num[3];
				num[3] = num[i];
				num[i] = temp;
			}
			printData(num);
		}
*/		
		System.out.println("======= 이중 for문으로 변경 =====");
		//기준값이 0 ~ 3 까지 변하면서
		for (int gijun = 0; gijun < 4; gijun++) {
			for (int i = gijun+1; i <= 4; i++) {
				if (num[gijun] > num[i]) {
					int temp = num[gijun];
					num[gijun] = num[i];
					num[i] = temp;
				}
			}
			printData(num);
		}
		
		System.out.print("정렬완료후 : ");
		printData(num);
		
		System.out.println("==== 오름차순 정렬 일반화 =======");
		int[] nums = {30, 20, 50, 40, 10};
		System.out.println("배열크기(length) : " + nums.length);
		System.out.print("정렬전 : ");
		printData(nums);
		
		for (int gijun = 0; gijun < nums.length - 1; gijun++) {
			for (int i = gijun+1; i < nums.length; i++) {
				if (nums[gijun] > nums[i]) {
					int temp = nums[gijun];
					nums[gijun] = nums[i];
					nums[i] = temp;
				}
				printData(nums);
			}
		}
		System.out.print("정렬후 : ");
		printData(nums);
		
		System.out.println("==================");
		int[] arr = {30, 20, 50, 40, 10};
		System.out.println("정렬전 : ");
		printData(arr);
		
		Arrays.sort(arr);
		
		System.out.println("정렬후 : ");
		printData(arr);
		
	}
	
	static void printData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	
	

}






