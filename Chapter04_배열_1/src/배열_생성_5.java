import java.util.Scanner;

public class 배열_생성_5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		int[] kor = new int[5];
//		int[] rank = new int[5];
//		for(int i =0;i<5;i++) {
//			kor[i]=scan.nextInt();
//		}
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				if(kor[i]>kor[j])rank[i]++;
//			}
//		}
//		for(int i: rank) {
//			System.out.println(i+1);
//		}
		
		
		
//		
//		int[] kor = new int[10];
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		
//		for(int i =0;i<10;i++) {
//			kor[i]=scan.nextInt();
//			min = min>kor[i]?kor[i]:min;
//			max = max<kor[i]?kor[i]:max;
//		}
//		System.out.println(min+"와"+max);
		
		
		
		int[] nan = new int[100];
		int[] avg = new int[10];
		for(int i =0;i<100;i++) {
			nan[i]=(int)(Math.random()*10);
			avg[nan[i]]++;
		}
		for(int i:avg)System.out.print(i+"\t");
		
		
	}
}
