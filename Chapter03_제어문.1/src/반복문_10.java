import java.util.Scanner;

public class 반복문_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳을 입력(대문자):");
		char c= scan.next().charAt(0);
		
		System.out.println("c=" +c);
		int index= 1;
		for( char ch='A';ch<='Z';ch++) {
			if(ch==c) break;
			index++;
		}
		System.out.println(c+"는(은) "+index+"번째 위치하고 있습니다");
	}
}
