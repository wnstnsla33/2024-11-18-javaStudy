
public class 연산자_이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 90;
		int eng = 90;
		int math = 80;
		System.out.println("국어 : " +kor);
		System.out.println("수학 : " +math);
		System.out.println("영어 : " +eng);
		
		System.out.print("국어 : " +kor);
		System.out.print(",수학 : " +math);
		System.out.print(",영어 : " +eng);
		
		System.out.println();
		System.out.printf("국어 : %d,영어 : %d,수학 : %d" , kor,math,eng );
		
		System.out.println();
		System.out.printf("%.2f",(kor+math+eng)/3.0);

		
		
	}

}
