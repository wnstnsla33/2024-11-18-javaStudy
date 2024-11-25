import java.util.Scanner;

public class 반복문_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력(2~9):");
		int dan = scan.nextInt();
		for(int i = 1;i<10;i++) {
			System.out.println(i*dan);
		}
	}

}
