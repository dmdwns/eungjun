
public class Ex_191001 {

	public static void main(String[] args) {
		/*
		巩力1
		1
		1 2
		1 2 3
		1 2 3 4
		*/
		System.out.println("---巩力1---");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("---巩力2---");
		/*
		巩力2
		1
		2 3
		4 5 6
		7 8 9 10
		*/
		
		int k=1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
			
		}

	}

}








