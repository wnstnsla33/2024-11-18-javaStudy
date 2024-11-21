import java.util.Scanner;

public class 자바제어문_단일조건문1 {
	public static void main(String[] args) {
		//정수 입력 > 짝수 /홀수
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = scan.nextInt();
		if(num%3==0) {
			System.out.println("3의 배수입니다");
		}
		if(num%3!=0) {
			System.out.println("3의배수가 아닙니다");
		}
	}
}
