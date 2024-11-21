import java.util.Scanner;

public class 연산자_삼항연산자2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100의 정수 입력");
		int i = scan.nextInt();
		System.out.println(i>=60?"합격":"불합격");
		
	}
		
	
}
