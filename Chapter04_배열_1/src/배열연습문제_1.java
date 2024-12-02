import java.util.Scanner;

public class 배열연습문제_1 {
	public static void main(String[] args) {
		char[] Carr= new char[10];
		int[] arr= new int[5];
		char[] day = {'일','월','화','수','목','금','토'};
		boolean[] bool = {true,false,false,true};
		
		Scanner scan = new Scanner(System.in);
		int[] arr2 = new int[10];
		for(int i =0;i<10;i++) {
			arr2[i]=scan.nextInt();
		}
		for(int i:arr2)if(i==0) System.out.println(i);
	}
	
}
