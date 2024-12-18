/*
 * 클래스
 *  사용자 정의 데이터형 : 데이터를 모아서 전송 목적, 데이터를 관리 변수 여러개를 모아서 관리
 *  
 *  
 *  ~VO :Value Object > 값만 저장 > Spring
 *  ~DTO : Data Transfer Object : 데이터를 모아서 전송
 *  	> 브라우저,윈도우,서버에 전송
 *  액션 클래스 : 변수 + 기능
 * 		> 메소드를 중심
 * 		> ~DAO : db 연결과 처리  > 오라클 /mysql
 * 		> ~Manager,~Service,~Model 
 * 
 */

class Card{
	char number;
	String type;
	static int width;
	static int height;
	//컴파일시에 자동 생성
}
public class 클래스_2 {
	 public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1);
		//c1.number . 은 메모리 주소 접근 연산자
		c1.number='A';
		Card c2 = new Card();
		c2.number =2;
		c2.type = " ♣";
		
		c1.width = 200;
	}
	 
	 
}
