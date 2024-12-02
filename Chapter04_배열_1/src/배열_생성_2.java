/*
 * 배열 출력 >index를 이용/for-each/Arrays.toString
 */
public class 배열_생성_2 {
	public static void main(String[] args) {
		int[] arr= new int[10];
		for(int i=1;i<=30;i++) {
			int num = (int)(Math.random()*10);
			System.out.print(num+" ");
			arr[num]++;
			
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
			
		}
	}

}
