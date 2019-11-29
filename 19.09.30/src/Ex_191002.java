
public class Ex_191002 {

	public static void main(String[] args) {
		/* char 타입 데이타 저장할수 있는 배열 사용해서 배열에 '*'를 저장하고, 배열에 있는
		  데이타를 사용해서 삼각형 모양으로 출력
		  
		  @         :배열의 첫번째 위치값을 출력
		  @ #       :배열의 첫번째 두번째 위치값을 출력
		  @ # $
		  @ # $ %
		  @ # $ % &
		 
		 *****************************/
		char[] ch= {'@', '#', '$', '%', '&'};
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(ch[j] + " ");
			}
			System.out.println();
		}

	}

}
