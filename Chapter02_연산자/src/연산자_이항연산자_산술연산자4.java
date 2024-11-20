/*
 *  키보드 입력
 *  1)BufferReader > java.io
 *  >예외처리
 *  2)Scanner > java.util
 */
import java.util.Scanner;
public class 연산자_이항연산자_산술연산자4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int kor =scan.nextInt();
		System.out.print("수학점수 입력 : ");
		int math =scan.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng =scan.nextInt();
		System.out.print("국어 :"+ kor);
		System.out.print("수학 :"+ math);
		System.out.print("영어 :"+ eng);
		
		
		
	}

}
