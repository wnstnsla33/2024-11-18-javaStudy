
/*
 * 중복없는 난수 > 3개 발생
 * 사용자 입력
 * 3자리 입력 > 맞추는 프로그램 : 숫자 야구게임
 * 369 
 * 123 > 0S-1B
 * 346 > 1S-1B
 */

import java.util.Scanner;

public class 배열_생성_4 {
	public static void main(String[] args) {
		int[] ans = new int[3];
		int[] user = new int[3];
		for (int i = 0; i < 3; i++) {
			ans[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (ans[j] == ans[i])
					i--;
			}

		}
		for(int i :ans)System.out.print(i);
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int s = 0, b = 0;
			int num = scan.nextInt();
			for (int i = user.length - 1; i >= 0; i--) {
				user[i] = num % 10;
				num /= 10;
			}
			for(int i=0;i<user.length;i++) {
				for(int j=0;j<user.length;j++) {
					if(user[i]==ans[j]) {
						if(i==j)s++;
						else b++;
					}
				}
			}
			System.out.println(s+"s "+b+"b");
			if(s==user.length)break;
			
			
		}
		System.out.println("정답입니다");
	}
}
