/*
 *  프로그램 작성법
 *  
 *  아이템 > 벤치마킹 > 요구사항분석 > DB 설계 
 *  
 *  화면UI > 기능 구현 > 테스트 > 배포
 *  
 *  1. 프로그램에 필요한 데이터 저장
 *  	> 한개씩 메모리에 저장 > 변수
 *  	변수 메모리에 저장되는 공간의 이름
 *  	> 1byte = 8bit > 127
 *  		맨앞이 	1: 음수
 *  			 	0: 양수
 *  	> 2bte = 16bit > 32767
 *  
 *  ==========
 *  데이터 변수명
 *  	1. 정수저장 
 *  		1byte : byte
 *  		2byte : short
 *  		4byte : int 모든 정수는 기본적으로 int형으로 인식함
 *  			- 저장 범위 -21억 ~ 21억
 *  		8byte : long 
 *  			- long num = 24억 으로하면 기본형인 int형으로 인식되어 오류가 발생하기 떄문에 L 을 적어야한다
 *  	2. 실수 저장  
 *  		4byte : float > 소수점 :6자리
 *  				> float num = 1.2f
 *  		8byte : double  > 소수점 : 15자리 (디폴트)
 *  				> double num = 10.5  실수는 기본 값으로 double 이기떄문에 float 처럼 뒤에 f가 필요 없음
 *  	3. 문자 저장
 *  		2byte : char 
 *  	4. 논리 (참/거짓) : 1byte
 *  		
 *  
 *  2. 저장된 데이터 활용
 *  3. 결과물 출력
 * 		system.out
 * 	
 * 
 * ===============
 * 변수명 규칙
 * 1. 특수 기호 사용 안됨(_,& 제외)
 * 2. 숫자로 시작하는 변수명 안됨
 * 3. 공백x
 * 4. 키워드x
 * 5. 알파벳으로 시작(필수는 아니지만 소문자로 시작한다.)
 */
public class 변수_1 {
	
	public static void main(String[] args) {
		   
	}
}
