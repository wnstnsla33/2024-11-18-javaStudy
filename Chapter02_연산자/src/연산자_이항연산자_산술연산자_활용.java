import java.util.Scanner;

public class 연산자_이항연산자_산술연산자_활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 영어 수학점수 입력:");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		System.out.println("=== 결과값 ===");
		System.out.println("국어 점수:" +kor);
		System.out.println("영어 점수:" +eng);
		System.out.println("수학 점수:" +math);
		
		
		System.out.println("총점: "+(kor+eng+math) );
		System.out.println("평균: "+(kor+eng+math)/3.0 );	
		
		
	}

}
