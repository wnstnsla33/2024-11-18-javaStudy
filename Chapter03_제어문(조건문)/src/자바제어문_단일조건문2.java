import java.util.Scanner;

public class 자바제어문_단일조건문2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번쨰 정수 입력:");
		int num1= scan.nextInt();
		System.out.print("두번쨰 정수 입력:");
		int num2= scan.nextInt();
		System.out.println("연산자 입력: + 43 - 45 * 42 / 47");
		char op = (char)scan.nextInt();
		if(op=='+') {
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		}
		if(op=='-') {
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
		}
		if(op=='*') {
			System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
		}
		if(op=='/') {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			else{
				System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			}
		}
		
		
		
	}

}
