import java.util.Arrays;

public class Ex05_Array_SelectionSort {

	public static void main(String[] args) {
		// 배열에 저장된 숫자 정렬(오름차순 : ASC)
		// 30, 20, 50, 40, 10
		int[] num = {30, 20, 50, 40, 10};
		
		//데이타 확인
//		for(int i=0; i<num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
		
		System.out.print("원본데이타: ");
		printData(num);//메소드 호출해서 데이타 확인
		
		System.out.println("------정렬시작-------");
//		//첫번째 값 기준으로 두번째 값과 비교작업(인덱스0 과 인덱스1 비교)
//		if(num[0]>num[1]) {
//			int temp=num[0];//첫번째 백업 데이타
//			num[0]=num[1];//0인덱스에 1인덱스 복사
//			num[1]=temp;//1인덱스 템프에 백업데이타 복사
//		}
//		printData(num);
//		
//		//첫번째 값 기준으로 세번째 값과 비교작업(인덱스0 과 인덱스2 비교)
//		if(num[0]>num[2]) { //temp오류가 없는 이유는 중괄호 안에서만 작동하기 때문
//			int temp=num[0];//첫번째 백업 데이타
//			num[0]=num[2];//0인덱스에 2인덱스 복사
//			num[2]=temp;//2인덱스 템프에 백업데이타 복사
//		}
//		printData(num);
//		
//		//첫번째 값 기준으로 네번째 값과 비교작업(인덱스0 과 인덱스3 비교)
//		if(num[0]>num[3]) { 
//			int temp=num[0];//첫번째 백업 데이타
//			num[0]=num[3];//0인덱스에 3인덱스 복사
//			num[3]=temp;//3인덱스 템프에 백업데이타 복사
//		}
//		printData(num);
//
//		//첫번째 값 기준으로 다섯번째 값과 비교작업(인덱스0 과 인덱스4 비교)
//		if(num[0]>num[4]) { 
//			int temp=num[0];//첫번째 백업 데이타
//			num[0]=num[4];//0인덱스에 4인덱스 복사
//			num[4]=temp;//4인덱스 템프에 백업데이타 복사
//		}
//		printData(num);
		
		System.out.println(">>>반복문으로 전환<<<");
/*
		//첫번째 값을 기준 - 반복문으로 전환(기준값은 인덱스0)
		for(int i=1; i<=4; i++) {
			if(num[0]>num[i]) {
				int temp=num[0];
				num[0]=num[i];
				num[i]=temp;
			}
			printData(num);
		}
		
		System.out.println("---인덱스1번---");
		//두번째 값을 기준 - 반복문으로 전환(기준값은 인덱스1)
		for(int i=2; i<=4; i++) {
			if(num[1]>num[i]) {
				int temp=num[1];
				num[1]=num[i];
				num[i]=temp;
			}
			printData(num);
		}
		
		System.out.println("---인덱스2번---");
		//세번째 값을 기준 - 반복문으로 전환(기준값은 인덱스2)
		for(int i=3; i<=4; i++) {
			if(num[2]>num[i]) {
				int temp=num[2];
				num[2]=num[i];
				num[i]=temp;
			}
			printData(num);
		}		
		
		System.out.println("---인덱스3번---");
		//네번째 값을 기준 - 반복문으로 전환(기준값은 인덱스3)
		for(int i=4; i<=4; i++) {
			if(num[3]>num[i]) {
				int temp=num[3];
				num[3]=num[i];
				num[i]=temp;
			}
			printData(num);
		}				
*/
		
		System.out.println("====이중for문으로 변경====");
		//기준값이 0 ~ 3까지 변하면서 
		for(int gijun=0; gijun<4; gijun++) {
			for(int i=gijun+1; i<=4; i++) {
				if(num[gijun]>num[i]) {
					int temp=num[gijun];
					num[gijun]=num[i];
					num[i]=temp;
				}
			}
			printData(num);
		
		}
		
		System.out.print("정렬완료: ");
		printData(num);
		
		System.out.println("=====오름차순 정렬 일반화=====");
		int[] nums = {30, 20, 50, 40, 10};
		System.out.println("배열크기: " + nums.length);
		System.out.print("정렬전: ");
		printData(nums);
		
		for(int gijun=0; gijun<num.length-1; gijun++) {
			for(int i=gijun+1; i<nums.length; i++) {
				if(nums[gijun]>nums[i]) {
					int temp=nums[gijun];
					nums[gijun]=nums[i];
					nums[i]=temp;
				}
			}
			printData(nums);
		}
		
		System.out.print("정렬후: ");
		printData(nums);
		
		System.out.println("====Arrays.sort()이용한 정렬====");
		int[] arr= {30,20,50,40,10};
		System.out.print("정렬전: ");
		printData(arr);
		
		Arrays.sort(arr); //Arrays.sort() --> 정렬 코드(이미 정렬코드는 제공한다)
		
		System.out.print("정렬후: ");
		printData(arr);
		
	}

	//메소드 만들기 위에 '데이타 확인 코드' 복사하기 위해 작성, 배열에 값만 저장했지 출력은 못함
	static void printData(int[] arr) { //타입은 일치 시켜줘야 한다 예를들어 int
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	

}














