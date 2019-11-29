
public class Ex04_switch_case {

	public static void main(String[] args) {
		// switch case문 : 동등비교구문
		/*
		switch (비교기준값) {
		case 비교값1 :
			실행할 문장(들);
			break;
		case 비교값2 :
			실행할 문장(들);
			break;
		...
		default :
			실행할 문장(들);
			break;
		}	
		*/
		int month = 6;
		
		switch (month) {
		case 1 :
			System.out.println("31일까지 있습니다");
			break;
		case 2 :
			System.out.println("28일 또는 29일까지 있습니다");
			break;
		case 3 :
			System.out.println("31일까지 있습니다");
			break;
		case 4 : case 6: 
			System.out.println("30일까지 있습니다");
			break;
		default : 
			System.out.println("일치하는 값이 없습니다.");
			break;
		}
		System.out.println(">> switch 끝");
		
		//---------------------------
		System.out.println("-----------------");
		switch (month) {
		case 1:
		case 3:
		case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		case 2 :
			System.out.println(month + "월은 28일 또는 29일까지 있습니다");
			break;
		case 4 : case 6: case 9: case 11: 
			System.out.println(month + "월은 30일까지 있습니다");
			break;
		default : 
			System.out.println("일치하는 값이 없습니다.");
			break;
		}
		
		//--------------------
		System.out.println("===================");
		/* 경품 추첨 결과에 따라 상품 지급
		1등 : 냉장고, 2등: 김치냉장고, 3등: 세탁기, 4등: 청소기
		등수에 해당하지 않으면(꽝인 경우) : 휴지
		*/
		String result = "1등";
		System.out.println("추첨결과 : " + result);
		String resultMsg = "";
		switch (result) {
			case "1등":
				//System.out.println("경품: 냉장고");
				resultMsg = "냉장고";
				break;
			case "2등":
				//System.out.println("경품: 김치냉장고");
				resultMsg = "김치냉장고";
				break;
			case "3등":
				System.out.println("경품: 세탁기");
				break;
			case "4등": //4등은 청소기 + 휴지 지급
				System.out.println("경품: 청소기, 휴지");
				break;
			default :
				System.out.println("경품: 휴지");
				break;
		}
		
		//추첨결과 출력
		System.out.println("추첨결과 " + result + " 경품은 " 
				+ resultMsg + " 입니다");
		
	}

}









