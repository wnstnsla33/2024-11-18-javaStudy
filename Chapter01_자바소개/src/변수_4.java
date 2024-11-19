/*   
 * 7+7+"3"+7+7 = 14377 순차적으로 계산함
 *   
 *   
 * 값 교환
 * 
 * int temp =a;
 * a=b;
 * b=temp;
 * 
 * 
 * 피연산자 
 * 	1. 단항연산자
 * 		>증감연산자(++,--)
 * 			int a =10;
 * 			int b= a++ + a++ + a++ =>33
 * 					10	+  11  +  12
 * 		>부정연산자(!)
 * 		>형변환 연산자
 * 	2. 이항연산자(!)
 * 		>산술연산자(+,-,*,/,%)
 * 		>비교연산자(==,!=,<,>)
 * 		>논리연산자($$,||)
 * 		>대입연산자(=)
 * 		>복합연산자(+=,-=)
 * 	3. 삼항연산자
 * 		>(조건)?값1(true):값2(false)
 *   
 */


public class 변수_4 {
	public static void main(String[] args) {
		
		int a= 10;
		a+=5;
		System.out.println(a);
		a-=5;
		System.out.println(a);
	}
}
