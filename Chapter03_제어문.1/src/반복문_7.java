import java.util.Scanner;

public class 반복문_7 {
	public static void main(String[] args) {
		
		int quiz = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하시오(1~100)");
		System.out.println(quiz);
		int answer = scanner.nextInt();
		while(answer!=quiz) {
			if(answer>quiz)System.out.println("Down");
			else System.out.println("Up");
			System.out.println("숫자를 입력하시오(1~100)");
			answer = scanner.nextInt();
		}
		System.out.println("정답은 "+answer+"입니다.");
	}
}
