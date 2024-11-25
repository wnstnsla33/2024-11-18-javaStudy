import java.util.Scanner;
/*
 * 
 * 반복문의 종류
 * 1)for > 반복문중 가장 많이 사용
 * 2)while > 파일 읽기
 * 3)do~while > 자바에는 사용 빈도가 거의 없다
 * 
 */
public class 자바선택문2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력");
		int num1 = scan.nextInt();
		
		System.out.println("두번쨰 정수 입력");
		int num2 = scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		
		switch(scan.next())
		{
		case "+" :
			System.out.println(num1+"+"+num2 +"="+(num1+num2));
			break;
		case "-" :
			System.out.println(num1+"-"+num2 +"="+(num1-num2));
			break;
		case "*" :
			System.out.println(num1+"*"+num2 +"="+(num1*num2));
			break;
		case "/" :
			System.out.println(num1+"/"+num2 +"="+(num1/num2));
			break;
		}
			
	}

}
