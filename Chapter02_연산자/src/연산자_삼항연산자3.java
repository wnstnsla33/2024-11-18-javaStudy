
/*
 * 점수입력 > 학점 a~d f
 *  a 학점 >=90
 *  b >=80
 *  c >=70
 *  
 */

import java.util.Scanner;

public class 연산자_삼항연산자3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 입력");
		int score = scanner.nextInt();
		System.out.print(score>=90 && score<=100?"A학점":"");
		System.out.print(score>=80 && score<90?"B학점":"");
		System.out.print(score>=70 && score<80?"C학점":"");
		System.out.print(score>=60 && score<70?"D학점":"");
		System.out.print(score>=0 && score<60?"F학점":"");
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		System.out.println("알파벳 입력");
		char c= scanner.next().charAt(0);		
		System.out.print(c>='a' && c<='z'?"소문자":"");
		System.out.print(c>='A' && c<='Z'?"대문자":"");
		
		 */
	}
}
