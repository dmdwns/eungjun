
public class Ex09_array2dim_exam {

	public static void main(String[] args) {
		/* (�ǽ�) 2���� �迭�� ���Ͽ�
		int[][] num2dim = {{10,20}, {30,40}, {50,60}};
		1. 2���� �迭�� num2dim�� ���� ȭ�鿡 ��� : 10 20 30....
		2. num2dim�� ����° ���� 30�� 100���� �����ϰ� ȭ�� ���
		3. num2dim�� ũ�⸸ŭ num2Copy �迭������ �����ϰ� num2dim�� ����
		   ������ �� num2Copy�� ���� ȭ�� ���
		*/
		int[][] num2dim = {{10,20}, {30,40}, {50,60} };
		
		for (int k = 0; k < num2dim.length; k++) {
			for (int i = 0; i < num2dim[k].length; i++) {
				System.out.print(num2dim[k][i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("==== 2�� ���� =========");
		//2. num2dim�� ����° ���� 30�� 100���� �����ϰ� ȭ�� ���
		System.out.println(num2dim[1][0]); 
		num2dim[1][0] = 100;
		System.out.println(num2dim[1][0]); 
		System.out.println("----");
		printData(num2dim);
		
		System.out.println("==== 3�� ���� ====");
		//3. num2dim�� ũ�⸸ŭ num2Copy �迭������ �����ϰ� 
		//   num2dim�� ���� ������ �� num2Copy�� ���� ȭ�� ���
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
		
		System.out.println("===== 2���� �迭 �� ���� ====");
		for (int k = 0; k < num2Copy.length; k++) {
			for (int i = 0; i < num2Copy[k].length; i++) {
				num2Copy[k][i] = num2dim[k][i];
			}
		}
		System.out.println("---> ������ ");
		
		printData(num2Copy);
		
		//================================
		// System.arraycopy() ��� ���·� ����
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







