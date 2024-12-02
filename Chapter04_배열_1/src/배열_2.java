import java.util.Arrays;

public class 배열_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i =0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
