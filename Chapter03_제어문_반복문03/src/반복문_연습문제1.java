import java.util.Scanner;

public class 반복문_연습문제1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int x= scan.nextInt();
		if(x>10&&x<20)System.out.println(true);
		//1번
		
		char ch = scan.next().charAt(0);
		if(ch=='x'||ch=='X')System.out.println(true);
		
		//3번
		 ch = scan.next().charAt(0);
		if(ch-0>=0&&ch-0<=9)System.out.println(true);
		//4번
		
		for(int i =1;i<7;i++) {
			for(int j=1;j<7;j++) {
				if(i+j==6)System.out.println(i+" + " + j+" = 6");
			}
		}
		//5
		
	}

}
