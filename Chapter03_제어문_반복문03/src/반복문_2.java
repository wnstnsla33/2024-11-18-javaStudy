import java.util.Scanner;

public class 반복문_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
				int i=1;
				while(i<=3) {
					System.out.print(i+"번째 국어 점수 입력:");
					int kor = scan.nextInt();
					System.out.print(i+"번째 국어 점수 입력:");
					int eng = scan.nextInt();
					System.out.print(i+"번째 국어 점수 입력:");
					int math = scan.nextInt();
					
					int total = kor +eng+math;
					double avg= total/3.0;
					
					char score ='A'; 
					switch(total/30) {
					case 10: case 9:
						score='A';
						break;
					case 8:
						score = 'B';
						break;
					case 7:
						score= 'C';
						break;
					case 6:
						score ='D';
						break;
					default:
						score ='f';
					}
					System.out.println("국어점수:"+kor);
					System.out.println("영어점수:"+eng);
					System.out.println("수학점수:"+math);
					System.out.println("총점:"+total);
					System.out.printf("평균:%.2f\n",avg);
					System.out.println("학점:"+score);
					i++;
					
				}
	}
}
