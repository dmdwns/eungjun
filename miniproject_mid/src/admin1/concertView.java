package admin1;

import java.util.List;

import admin.ConcertInfoVO;
import admin.concertTotalVO;

public class concertView {
	HallDAO hall = new HallDAO();
		
	public concertView(){
		
		
	}
		
	public void selectConcertView(List<ConcertInfoVO> v2,int str) {
		
		System.out.println("선택하신 콘서트 : " + v2.get(str).getConcert_name());
		System.out.println();
		System.out.println("콘서트번호\t콘서트위치    \t총좌석수");
		hall.concertView(v2.get(str).getHall_num());



	}


}
	
