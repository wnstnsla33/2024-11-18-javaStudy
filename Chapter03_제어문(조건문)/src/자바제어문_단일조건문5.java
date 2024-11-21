import java.util.Scanner;

public class 자바제어문_단일조건문5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("국어 점수 입력:");
		int kor = scan.nextInt();
		System.out.println("영어 점수 입력:");
		int eng = scan.nextInt();
		System.out.println("수학 점수 입력:");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("총점 :"+total+" 평균 : "+avg);
		
		char score='A';
		int temp =total/3;
		
		if(temp>=90 && temp<=100)score='A';
		else if(temp>=80 && temp<90)score='B';
		else if(temp>=70 && temp<80)score='C';
		else if(temp>=60 && temp<70)score='D';
		else if(temp>=50 && temp<60)score='E';
		else score = 'f';
		System.out.println("학점은 " +score+" 입니다.");
	}

}
