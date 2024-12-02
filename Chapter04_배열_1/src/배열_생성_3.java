import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 배열_생성_3 {
	public static void main(String[] args) {
		int[] arr = new int[10];
//		while(cnt<100) {
//			int x= (int)(Math.random()*10)+1;
//			arr[x-1]=x;
//			cnt++;
//		}
//		for(int i:arr) {
//			System.out.print(i);
//		}

		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
	}
}
