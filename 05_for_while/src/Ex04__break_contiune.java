
public class Ex04__break_contiune {

	public static void main(String[] args) {
		// 제어명령문: break, continue
		// break: 반복문을 중단시키고 빠져나감
		// continue: 계속진행(다음 반복 처리로 진행)
		//         -반복문의 맨 끝으로 이동
		
		//1~10까지 출력 단 8은 출력하지 말 것(continue)
		for(int i=1; i<=10; i++) {
			if(i != 8) {
				System.out.println(i);
			}
		}
		
		System.out.println("-------------------");
		for(int i=1; i<=10; i++) {
			if(i==8) {
				
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("---------continue----------");
		for(int i=1; i<=10; i++) {
			if(i==8) continue;//컨티뉴를 만나면 반복문 맨끝으로 간다, 건너뛴다
			System.out.println(i);
		}
		
		
		System.out.println("---------break----------");
		//1~10까지 중 8인 경우 처리 중단
		for(int i=1; i<=10; i++) {
			if(i==8) break;//반복문을 중단하고 빠져나감
			System.out.println(i);
		}
		System.out.println(">>>break 처리후");
	}

}



















