
public class Ex09_for_gugudan {

	public static void main(String[] args) {
		/*구구단 2단
		2*1=2
		2*2=4
		2*3=6
		2*4=8
		2*5=10
		2*6=12
		2*7=14
		2*8=16
		2*9=18
		**************/
		System.out.println(2 + "*" + 1 + "=" + (2*1));
		System.out.println(2 + "*" + 2 + "=" + (2*2));
		System.out.println(2 + "*" + 3 + "=" + (2*3));
		System.out.println("...");
		System.out.println(2 + "*" + 9 + "=" + (2*9));
		
		System.out.println("===========2단_01==========");
		
		int num=1;
		for (int i=1; i<=9; i++) {
			System.out.println(2 + "*" + num + "=" + (2*num));
			num++;
			
		}
		System.out.println("=========2단_02==============");
		for(int i=1; i<=9; i++) {
			System.out.println(2 + "*" + i + "=" + (2*i));
		}
		
		System.out.println("=========3단==============");
		for(int i=1; i<=9; i++) {
			System.out.println(3 + "*" + i + "=" + (3*i));
		}
		
		System.out.println("=========4단==============");
		for(int i=1; i<=9; i++) {
			System.out.println(4 + "*" + i + "=" + (4*i));
		}
		System.out.println("");
		
		System.out.println("=======================");
		System.out.println("구구단 모두 출력(세로)");
		
		for(int dan=2; dan<=9; dan++) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
			
		}
		System.out.println("");
		
		}
		
		
		
		
		
	}
	
	
	
	

}




























