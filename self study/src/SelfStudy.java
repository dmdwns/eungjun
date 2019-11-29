
public class SelfStudy {

	public static void main(String[] args) {
	
		int[][] num2dim= {{10,20}, {30,40}, {50,60}};
		int[][] num2Copy=new int[num2dim.length][];
		for(int i=0; i<num2dim.length; i++) {
			num2Copy[i]=new int[num2dim[i].length];
		}
		num2Copy[0][0]=num2dim[0][0];
		for(int k=0; k<num2Copy.length; k++) {
			for(int i=0; i<num2Copy[k].length; i++) {
				System.out.print(num2Copy[k][i] + " ");
			}
		}
		System.out.println();
	}

}















