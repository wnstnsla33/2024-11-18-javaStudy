import java.util.Scanner;

public class 반복문_연습문제2 {

	public static void main(String[] args) {

		for(int i =1;i<=5;i++) {
			for(int j =1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		for(int i =1;i<=5;i++) {
			for(int j =1;j<=5;j++) {
				if(i==j)System.out.print(i);
				else System.out.print('#');
			}
			System.out.println();
		}

		for(int i =1;i<=5;i++) {
			for(char c ='A';c<='E';c++) {
				System.out.print(c);
			}
			System.out.println();
		}

		for(char c ='A';c<='E';c++) {
			for(int j =1;j<=5;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		for(int i =0;i<5;i++) {
			for(int j =0;j<5;j++) {
				if(i==j||i+j==4)System.out.print('★');
				else System.out.print('☆');
			}
			System.out.println();
		}
		System.out.println();
		for(int i =0;i<5;i++) {
			for(int j =0;j<5;j++) {
				if(i%4==0&&j%4==0)System.out.print("★");
				else System.out.print("☆");
			}
			System.out.println();
		}
	}
}
