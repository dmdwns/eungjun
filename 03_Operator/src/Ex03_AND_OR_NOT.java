
public class Ex03_AND_OR_NOT {

	public static void main(String[] args) {
		// 논리연산자 : && (AND), || (OR), ! (NOT)
		// 논리연산자(&&, ||)의 좌/우에는 true, false 값이 있어야 함
		int num1 = 10;
		int num2 = 20;
		boolean bool1 = false;
		boolean bool2 = true;
		System.out.println("--- && (AND) ---");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));

		System.out.println(">>>");
		System.out.println(bool1 + " && " + bool2 + " : " 
				+ (bool1 && bool2));
		
		System.out.println("-----------");
		boolean result = (num1 < num2) && bool1;
		System.out.println(num1 + " < " + num2 + " && " + bool1 
				+ " : " + result);
		
		System.out.println("--- || (OR) ---");
		System.out.println("false || true : " + (false || true));
		result = num1 > num2 || bool2;
		System.out.println("num1 > num2 || bool2 : " + result);
		
		System.out.println("\n--- ! (NOT) ---");
		System.out.println("!true : " + !true);
		result = !(num1 > num2 || bool2);
		System.out.println("!(num1 > num2 || bool2) : " + result);
		
	}

}





