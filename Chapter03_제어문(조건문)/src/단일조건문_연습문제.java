import java.util.Scanner;

public class 단일조건문_연습문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력");
		int num= scan.nextInt();
		System.out.println(num>0?"양수입니다":"음수입니다");
		
		System.out.println(num%3==0?"3의배수입니다":"3의 배수가 아닙니다");
		
		System.out.println("2자리수 정수 입력");
		int num2 = scan.nextInt();
		System.out.println(num2%11==0?"10의자리와 1의자리가 같습니다":"10의자리와 1의자리가 다릅니다");
		
		System.out.println("달을 입력하세요");
		int season = scan.nextInt();
		if(season>=3&&season<=5)System.out.println("봄");
		else if(season>=6&&season<=8)System.out.println("여름");
		else if(season>=9&&season<=11)System.out.println("가을");
		else if(season>=12&&season<=2)System.out.println("겨울");
		else System.out.println("잘못입력하였습니다");
		
	}
}
