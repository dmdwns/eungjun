
public class Ex10_for_gugudan2 {

	public static void main(String[] args) {
		/* 구구단출력
		2*1=2	3*1=3	...	9*1=9
		.
		.
		.
		2*9=18	3*9=27	...	9*9=81	
		*/
		for(int out=1; out<=9; out++) {
			for(int in=2; in<=9; in++) {
				System.out.print(in +"*"+ out +"=" + (in*out));
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		System.out.println("====================================== ");
		for(int gop=1; gop<=9; gop++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan + "*" + gop + "=" + (dan*gop));
				System.out.print("\t");//탭만큼 띄우기
			}
		System.out.println();
		
		}
		
		System.out.println("======맞나?====");
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "*" + i + "=" + (i*j));
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("=========맞나?_01============");
		for(int k=1; k<=9; k++) {
			for(int l=1; l<=9; l++) {
				System.out.print(l + "*" + k + "=" + (l*k));
				System.out.print("\t");
			}
			System.out.println();
		}
		

	}

}

















