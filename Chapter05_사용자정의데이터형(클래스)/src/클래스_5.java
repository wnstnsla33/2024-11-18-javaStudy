import java.util.Scanner;

class Student
{
	String name;
	int kor,eng,math;
	int total;
	double avg;
	char score;
}
public class 클래스_5 {
	public static void main(String[] args) {
		Student[] std=  new Student[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =0;i<std.length;i++	) {
			std[i]=new Student();
			System.out.println((i+1)+"번째 국어 입력");
			std[i].kor=scan.nextInt();
			System.out.println((i+1)+"번째 영어 입력");
			std[i].eng=scan.nextInt();
			System.out.println((i+1)+"번째 수학 입력");
			std[i].math=scan.nextInt();
			
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			std[i].avg=std[i].total/3.0;
			
			switch(std[i].total/30) {
			case 10: case 9: 
				std[i].score='A';
				break;
			case 8: 
				std[i].score='B';
				break;
			case 7: 
				std[i].score='C';
				break;
			}
		}
			for(int i=0;i<std.length;i++	) {
			}
		}
	}
