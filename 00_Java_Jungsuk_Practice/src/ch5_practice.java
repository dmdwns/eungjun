
public class ch5_practice {

	public static void main(String[] args) {
		System.out.println("[연습문제5-4]");
		//다음 2차원 배열의 모든 총합과 평균을 구하라
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		int tot = 0;
		float avg = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];
			}
		}
		avg = tot / (float)(arr.length * arr[0].length);
		System.out.println("총합 : " + tot);
		System.out.println("평균 : " + avg);
		
		System.out.println("[연습문제5-6]");
		//거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산
		//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력
		//가능한 적은 수의 동전으로 거슬러 줘야함
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + money/coinUnit[i]);
			money = money%coinUnit[i];//나눈 나머지=거슬러줘야하는 돈
		}
		
		System.out.println("[연습문제5-7]");//몰라 이해안됨
		//5-6연결
		//보유한 동전의 갯수로 거스름돈을 지불할 수 없으면 '거스름 돈이 부족합니다' 출력
		//지불할 돈이 있으면 거스름돈을 지불한 만큰 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력
		int[] coin = {5, 5, 5, 5};
		for(int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			//금액을 동전단위로 나워서 필요한 동전의 갯수를 구한다
			coinNum = money / coinUnit[i];
			//배열coin에서 coinNum만큼의 동전을 뺀다.
			//충분한 동전이 없다면 배열 coin에 있는 만큼 뺀다.
			if(coin[i] >= coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			//금액에서 동전의 개수와 동전단위를 곱한 값을 뺀다.
			money -= coinNum * coinUnit[i];
			
			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다");
			System.exit(0);
		}
		System.out.println("남은 동전의 갯수");
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + coin[i]);
		}
		
	}

}





















