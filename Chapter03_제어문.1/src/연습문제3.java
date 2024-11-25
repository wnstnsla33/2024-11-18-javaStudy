
public class 연습문제3 {

	public static void main(String[] args) {
		for (int i = 2; i <= 30; i += 2) {

			System.out.print(i + "\t");
			if (i % 6 == 0)
				System.out.println();
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1)
				sum += i;
			else
				sum -= i;
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10 까지의 합:" + sum);

		for (int i = 0; i <= 10; i++) {
			if(i%3==0) continue;
			System.out.print(i+ "\t");
		}
	}
}
