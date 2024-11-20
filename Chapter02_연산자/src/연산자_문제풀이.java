import java.util.Scanner;

public class 연산자_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("세개의 정수를 입력하시오");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("계산결과는 "+(a*b+c)+"입니다");
		
		System.out.println("정수 두개를 입력하시오");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("계산결과 나머지는 " +(x%y)+"입니다");
		
	}

}
