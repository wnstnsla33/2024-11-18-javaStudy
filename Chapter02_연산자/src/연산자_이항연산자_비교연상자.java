/*
 * 
 * 비교연산자 > 숫자나 논리만 비교
 * - == 같다
 * - != 다르다
 * - </> 작다/크다
 * - <=,>= 작거나,크거나 같다
 * 
 * 
 * 
 */
public class 연산자_이항연산자_비교연상자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(6==7);
		System.out.println(6!=7);
		System.out.println(6>7);
		System.out.println(6<7);
		
		char c= 'A';
		int a =65;
		// char 는 연산시 정수로 변경됨
		System.out.println(c==a);
		System.out.println('a'-'a' ==0);
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1==s2);//주소로 판단하기 때문에 객체의 주소가 달라 거짓이됨
		System.out.println(s1.equals(s2));
		
		
		
	}

}
