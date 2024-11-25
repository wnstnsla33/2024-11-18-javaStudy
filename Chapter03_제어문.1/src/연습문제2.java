import java.util.Scanner;

public class 연습문제2 {
	public static void main(String[] args) {
		System.out.print("2+4+6+...+100의 합: ");
		int sum=0;
		for(int i=2;i<=100;i+=2) {
			sum+=i;
		}
		System.out.print(sum);
		System.out.println("4번");
		
		for(int i=5;i<55;i+=5	) {
			System.out.print(i+"\t");
		}
		
		System.out.println("5번");
		for(char c = 'B';c<='N';c+=2	) {
			System.out.print(c+"\t");
		}
		
		System.out.println("6번");
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 :");
		int val = scan.nextInt();
		System.out.print("\n1~"+val+"까지의 합:");
		sum=0;
		for(int i=1;i<=val;i++) {
			sum+=i;
		}
		System.out.print(sum);
	}
	
	
}
