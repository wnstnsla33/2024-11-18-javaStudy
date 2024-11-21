/*
 * 삼항연산자
 * (조건)?값1:값2
 * 조건 >true :값1
 * 	   >false:값2
 */
public class 연산자_삼항연산자1 {
	public static void main(String[] args) {
		char c = 'a';
		System.out.println(c>='A'&&c<='Z'?"대문자":"소문자");
		c='A';
		System.out.println(c>='A'&&c<='Z'?"대문자":"소문자");
		int a = (int)(Math.random()*100)+1;
		System.out.println(a);
		System.out.println(a%2==0?"짝수":"홀수");
	
		
		
	}

}
