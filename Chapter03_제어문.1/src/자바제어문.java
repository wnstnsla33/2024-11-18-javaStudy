
/*
 * 제어문 > 연산자가 응용
 * -----배열
 * 		---메소드
 * 			===클래스
 * 1.
 */
import java.util.Scanner;
public class 자바제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner scan = new Scanner(System.in);
		System.out.println("연산할 숫자를 적으시요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("부호를 입력하시오");
		char c = scan.next().charAt(0);
		
		if(c=='%') System.out.println(num1%num2);
		else if(c=='/') System.out.println(num1/num2);
		else if(c=='+') System.out.println(num1+num2);
		else if(c=='-') System.out.println(num1-num2);
		else  System.out.println("잘못 입력하였습니다");
		
		
		
	}

}
