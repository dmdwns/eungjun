
public class Ex02_gt_lt {

	public static void main(String[] args) {
		// 비교연산자 : >, <, >= (크거나 같다), <= (작거나 같다)
		//           == (같다/동일하다), != (같지 않다, 다르다)
		// 비교연산의 결과 값 : true, false
		int num1 = 30;
		int num2 = 20;
		//num1 > num2 -> ??
		System.out.println(num1 > num2);
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
		// ctrl + alt + 아래쪽 방향키 : 복사, ctrl + D : 한줄 삭제
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
		
		System.out.println("=======================");
		boolean power = true; //전원이 켜짐
		System.out.println("power : " + power);
		power = !power; //현재 저장된 값이 아닌 값(true <-> false)
		System.out.println("power : " + power);
		power = !power; //현재 저장된 값이 아닌 값(true <-> false)
		System.out.println("power : " + power);
		
		System.out.println("-------------");
		power = false;
		if (power) {//power 값이 true 일 때 동작
			System.out.println("power값이 true : 전원ON 상태");
		}
		if (!power) {//power 값이 false 일 때 동작
			System.out.println("power값이 false : 전원OFF 상태");
		}
		
	}

}












