/*
 * 
 * int a = 10; -> 뒤에서 부터 처리
 * 10을 a에 대입(a를 10에 넣어라 X)
 * 
 * a+=5 > a= a+5
 * a-=5 > a= a-5
 */
public class 연산자_이항연산자_대입연산자 {
	public static void main(String[] args) {
		int i = 10;
		i+=5;
		System.out.println(i);
		i-=5;
		System.out.println(i);
	}

}
