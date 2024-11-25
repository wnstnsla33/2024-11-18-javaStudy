import java.util.Scanner;

public class 연습문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		int score = scan.nextInt();
		char jumsu = ' ';
		switch(score/10) {
		case 9, 10: 
			jumsu = 'A';
		case 8: 
			jumsu = 'B';
		case 7: 
			jumsu = 'C';
		case 6: 
			jumsu = 'D';
		case 1,2,3,4,5:
			jumsu = 'F';
		
		}
		System.out.println(jumsu);
	
		
		System.out.println("정수입력");
		int a= scan.nextInt();
		System.out.println("+,-.,*,/ 입력");
		char sign = scan.next().charAt(0);
		System.out.println("정수입력");
		int b= scan.nextInt();
		switch(sign){
		case '+': 
			System.out.print(a + " + "+b+" = ");
			System.out.println(a+b);
		case '-': 
			System.out.print(a + " - "+b+" = ");
			System.out.println(a-b);
			
		case '*': 
			System.out.print(a + " * "+b+" = ");
			System.out.println(a*b);
		case '/': 
			System.out.print(a + " / "+b+" = ");
			System.out.println(a/b);
		}
	}
	

}
