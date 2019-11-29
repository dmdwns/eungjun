
public class Ex11_for_gugudan2 {

	public static void main(String[] args) {
		/* 구구단 2~9단 출력
		2*1=2   3*1=3  ... 9*1=9
		2*2=4   3*2=6  ... 9*2=18
		...
		2*9=18  3*9=27 ... 9*9=81
		*/
		for (int out = 1; out <= 9; out++) {
			for (int in = 2; in <= 9; in++ ) {
				System.out.print(in +" * "+ out +" = " + (in * out));
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("==============");
		for (int gop = 1; gop <= 9; gop++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + gop + "=" + (dan * gop));
				System.out.print("\t");
			}
			System.out.println();
		}
		

	}

}





