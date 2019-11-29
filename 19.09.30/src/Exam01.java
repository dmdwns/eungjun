
public class Exam01 {

	public static void main(String[] args) {
		int a=30;
		int b=60;
		int c=20;
		int d=90;
		int e=70;
		if (a>=b && a>=c && a>=d && a>=e) {
			System.out.println("가장큰수 : " +a);
		} else if (b>=a && b>=c && b>=d && b>=e) {
			System.out.println("가장큰수: " +b);
		} else if (c>=a && c>=b && c>=d && c>=e) {
			System.out.println("가장큰수: " +c);
		} else if (d>=a && d>=b && d>=c && d>=e) {
			System.out.println("가장큰수: " +d);
		} else {
			System.out.println("가장큰수: " +e);
		}
		
		System.out.println("=========================");
		//array 배열 안배움 구글 카피
		int array[] = {30, 60, 20, 90, 70};
		int max = array[0]; //최댓값
		int min = array[0]; //최솟값
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {//max의 값보다 array[i]이 크면 max = array[i]
				max = array[i];
			}
			if (min>array[i]) {//min의 값보다 array[i]이 작으면 min = array[i]
				min=array[i];
			}
		}
		System.out.println("최댓값 : " +max);
		System.out.println("최솟값 : " +min);
		
		System.out.println("===teacher's solution_01===");

	}

}













