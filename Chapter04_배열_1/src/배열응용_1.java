import java.util.Scanner;

public class 배열응용_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력:");
		int year = scan.nextInt();
		
		System.out.println("월 입력");
		int month = scan.nextInt();
		
		System.out.println("일 입력");
		//int day = scan.nextInt();
		
		int total = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		
		int[] lastday= {31,28,31,30,31,30
				,31,31,30,31,30,31};
		
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			lastday[1]=29;
		}
		else lastday[1]=28;
		for(int i=0;i<month;i++) {
			total+=lastday[i];
		}
		total++;
		
		char[] strWeek= {'일','월','화','수','목','금','토'};
		int week = total%7;
		
		System.out.println(year+"년도 "+month+"월 " +strWeek[week]+"요일입니다");
		System.out.println();
		for(char c:strWeek) {
			System.out.print(c+"\t");
		}
		
		System.out.println();
		for(int i =1;i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
				System.out.printf("%2d\t",i);
			}
		}
		
		
		
		
		
		
		
		
		
	
	
}

	  
	
}
