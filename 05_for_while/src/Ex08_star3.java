
public class Ex08_star3 {

	public static void main(String[] args) {
		// ½Ç½À¹®Á¦
		// ***** : * 5¹ø
		// ****  : * 4¹ø
		// ***   : * 3¹ø
		// **    : * 2¹ø
		// *     : * 1¹ø
		//------------------------
		int lineCnt = 10;
		int starCnt = 10;
		for (int line = 1; line <= lineCnt; line++) {
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			starCnt--;
		}
		
		System.out.println("====================");
		// º°Âï±â
		//    * : ºóÄ­ 4 + * 1°³ + ÁÙ¹Ù²Þ
		//   ** : ºóÄ­ 3 + * 2°³ + ÁÙ¹Ù²Þ
		//  *** : ºóÄ­ 2 + * 3°³ + ÁÙ¹Ù²Þ
		// ****
		//*****
		//-------------
		int spaceCnt = 4;
		starCnt = 1;
		for (int line = 1; line <= 5; line++) {
			//ºóÄ­ Ãâ·Â¿ë ¹Ýº¹¹®(4, 3, 2, 1, 0)
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			
			// * Ãâ·Â¿ë ¹Ýº¹¹®(1, 2, 3, 4, 5)
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCnt--;
			starCnt++;
		}
		System.out.println("======================");
		
		//======================================
		//***** : ºóÄ­ 0, * 5, ÁÙ¹Ù²Þ
		// **** : ºóÄ­ 1, * 4, ÁÙ¹Ù²Þ 
		//  *** : ºóÄ­ 2, * 3, ÁÙ¹Ù²Þ
		//   **
		//    *
		//------------------------------------
		
		
	}

}


