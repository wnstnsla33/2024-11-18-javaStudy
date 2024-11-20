/*
 * 형변환 연산자
 * 
 * 데이터 형의 크기
 *  	<<<<     	   >>>> 
 *  downcasting     upcasting
 *  	(강제)		  (자동)		
 *  byte < short < int < long < flaoat <double
 *  	   char
 *  다른 크기의 데이터가 연산 시 큰 데이터로 변경후 연산함
 *   예) int 10 + double 10.5 = 20.5 
 *   	- int의 10을 double로 형변환 후 연산
 *  
 *  예외)
 *  - int 보다 작은 데이터형끼리 더할 경우 int로 변함
 *   byte +byte,char + char
 *   \
 * 	
 * 	필요시에는 강제로 변환(형변환 연산자)
 *  int a = (int)10.5
 * 
 */
public class 연산자_단항연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte a = 100;
//		byte b = 27;
//		int c = a +b; 
		int x = 10;
		int y = 3;
		System.out.println(x/y);
		System.out.println(x/(double)y);
		
		int a= 123456;
		double b= 123456.78;
		int res = (int)((b-a)*100);
		System.out.println(res);
		// 같은 크기의 데이터를 연산하는게 좋다
	}

}
