
public class Ex09_array2dim_exam {

	public static void main(String[] args) {
		/* (실습) 2차원 배열에 대하여
		int[][] num2dim = {{10,20}, {30,40}, {50,60}};
		1. 2차원 배열인 num2dim의 값을 화면에 출력 : 10 20 30....
		2. num2dim의 세번째 값인 30을 100으로 변경하고 화면 출력
		3. num2dim의 크기만큼 num2Copy 배열변수를 선언하고 num2dim의 값을
		   복사한 후 num2Copy의 값을 화면 출력
		*/
		int[][] num2dim = {{10,20}, {30,40}, {50,60} };
		
		for (int k = 0; k < num2dim.length; k++) {
			for (int i = 0; i < num2dim[k].length; i++) {
				System.out.print(num2dim[k][i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("==== 2번 문제 =========");
		//2. num2dim의 세번째 값인 30을 100으로 변경하고 화면 출력
		System.out.println(num2dim[1][0]); 
		num2dim[1][0] = 100;
		System.out.println(num2dim[1][0]); 
		System.out.println("----");
		printData(num2dim);
		
		System.out.println("==== 3번 문제 ====");
		//3. num2dim의 크기만큼 num2Copy 배열변수를 선언하고 
		//   num2dim의 값을 복사한 후 num2Copy의 값을 화면 출력
		//int[][] num2Copy = new int[num2dim.length][num2dim[0].length];
		int[][] num2Copy = new int[num2dim.length][];
//		num2Copy[0] = new int[num2dim[0].length];
//		num2Copy[1] = new int[num2dim[1].length];
//		num2Copy[2] = new int[num2dim[2].length];
		
		for (int i = 0; i < num2dim.length; i++) {
			num2Copy[i] = new int[num2dim[i].length];
		}
		
//		num2Copy[0] = num2dim[0];
//		System.out.println(num2dim[0]);
		num2Copy[0][0] = num2dim[0][0];
		
		printData(num2dim);
		System.out.println("----");
		
		printData(num2Copy);
		
		System.out.println("===== 2차원 배열 값 복사 ====");
		for (int k = 0; k < num2Copy.length; k++) {
			for (int i = 0; i < num2Copy[k].length; i++) {
				num2Copy[k][i] = num2dim[k][i];
			}
		}
		System.out.println("---> 복사후 ");
		
		printData(num2Copy);
		
		//================================
		// System.arraycopy() 사용 형태로 적용
		//System.arraycopy(src, srcPos, dest, destPos, length);
		
		
	}
	
	static void printData(int[][] arr) {
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr[k].length; i++) {
				System.out.print(arr[k][i] + " ");
			}
		}
		System.out.println();
	}

}







