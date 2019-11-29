
public class Ex03_array3 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		dispData(nums);
		//-------------------
		//�迭�� �ִ� �� �� ¦���� ¦������ �ջ�(evenSum)
		//�迭�� �ִ� �� �� Ȧ���� Ȧ������ �ջ�(oddSum)
		//¦���հ�, Ȧ���հ� �� ���
		int evenSum = 0; //¦���հ�
		int oddSum = 0; //Ȧ���հ�
		
		boolean even = nums[0] % 2 == 0; //¦������ Ȯ��
		System.out.println(even);
		//¦��, Ȧ�� �հ� ���ϱ�
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) { //¦����? - ¦���� ���
				evenSum = evenSum + nums[i];
			} else { //Ȧ��
				oddSum += nums[i];
			}
		}
		//���
		System.out.println("Ȧ���հ� : " + oddSum
				+ ", ¦���հ� : " + evenSum);
		//=========================================

	}
	
	//�޼ҵ�, �޼���(method)
	static void dispData(int[] arr) { //�Ű����� int[] ���� ����
		System.out.println("==== �迭 ����Ÿ ��� ===");
		for (int i = 0; i < arr.length; i++) {
			System.out.println( i + " : " + arr[i]);
		}
		System.out.println("--------------------------");
	}

}
