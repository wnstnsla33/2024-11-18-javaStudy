import java.util.Calendar;
import java.util.Scanner;

public class 배열응용_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("년도입력");
		int year = scan.nextInt();
		System.out.println("월 입력");
		int month = scan.nextInt();
		System.out.println("일 입력");
		int day = scan.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);
		c.set(Calendar.DATE,day);
		
		char[] strWeek= {' ','일','월','화','수','목','금','토'};
		int week=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 " +strWeek[week]+"요일입니다");
		
		int lastday=c.getActualMaximum(Calendar.DATE);
		System.out.println("마지막 날: "+lastday);
		
	}

}
