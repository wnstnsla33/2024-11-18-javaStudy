/*
 * 
 * 1. 정수 숫자 표현
 * 		10진법
 * 		8진법 숫자앞에 0을(예 012) 넣을경우 8진법으로 인식됨 
 * 		16진법
 * 
 * 2. 데이터 저장 방법
 * 		1) 명시적 초기화 int a = 19;
 * 		2) 입력을 받아서 초기화
 * 		3) 난수발생 random
 * 
 */


public class 변수_2 {

	public static void main(String[] args) {
		
			byte byteVal = 127;
			
			short shortVal= 256;
			
			int intVal = 21400000;
			
			Long longVal = 210L;
			// int  형식(4byte)을 벗어나는 숫자일 경우 L을 기입
			
			//값 수정
			int b = 'A';
			System.out.println(b);
			
			char c = 76;
			System.out.println(c);
			// 'a' = 97, 'A' = 65 , '0'= 48
			
			System.out.println((int)'홍');
			
			boolean boo = false;
			System.out.println(boo);
			
			float f = 10.5f;
			System.out.println(f);
			//float에 f가 없으면 기본값이 double 이라서 오류발생
			
			double d = 10.2;
			System.out.println(d);
			//왼쪽에 있는 데이터형이 크거나 같아야 저장이 가능 (반대는 안됨)
			
			
			
			
	}

}
