import java.util.Scanner;

public class 자바제어문_단일조건문3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력");
		char ch = scan.next().charAt(0);
		System.out.println("ch=" + ch);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + "는 대문자입니다");
		}else if(ch>='a'&&ch<='z'){
			System.out.println(ch + "는 소문자입니다");
		}else {
			System.out.println("영어를 입력하시오");
		}
		
	}

}
