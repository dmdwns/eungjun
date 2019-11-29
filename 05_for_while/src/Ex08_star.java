
public class Ex08_star {

	public static void main(String[] args) {
		//½Ç½À¹®Á¦
		/*
		*****
		****
		***
		**
		*
		 */
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		//º°Âï±â
		//    * ºóÄ­ 4°³ º°1°³ ÁÙ¹Ù²Ş
		//   ** ºóÄ­ 3°³ º°2°³ ÁÙ¹Ù²Ş
		//  *** ºóÄ­ 2°³ º°3°³ ÁÙ¹Ù²Ş
		// **** ºóÄ­ 1°³ º°4°³ ÁÙ¹Ù²Ş
		//***** ºóÄ­ 0°³ º°5°³ ÁÙ¹Ù²Ş
		//ºóÄ­À» Âï´Â ¹İº¹¹® ¸ÕÀú, º°Âï´Â ¹İº¹¹® ´ÙÀ½
	
		int spaceCnt = 4;
		int starCnt = 1;
		for(int line=1; line<=5; line++) {
			for(int space=1; space<=spaceCnt; space++) {
				System.out.print(" ");
			}
			for(int star=1; star<=starCnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCnt--;
			starCnt++;
		}
		
		System.out.println("========================");
		//º°Âï±â
		//***** ºóÄ­ 0°³ º°5°³ ÁÙ¹Ù²Ş
		// **** ºóÄ­ 1°³ º°4°³ ÁÙ¹Ù²Ş
		//  *** ºóÄ­ 2°³ º°3°³ ÁÙ¹Ù²Ş
		//   ** ºóÄ­ 3°³ º°2°³ ÁÙ¹Ù²Ş
		//    * ºóÄ­ 4°³ º°1°³ ÁÙ¹Ù²Ş
		//ºóÄ­À» Âï´Â ¹İº¹¹® ¸ÕÀú, º°Âï´Â ¹İº¹¹® ´ÙÀ½
		int space=0;
		int star=5;
		for(int i=1; i<=5; i++) {
			for(int j=0; j<=space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
	}

}





















