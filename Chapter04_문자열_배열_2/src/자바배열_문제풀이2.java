import java.util.Arrays;

public class 자바배열_문제풀이2 {
	public static void main(String[] args) {
		char[] arr = {'A','C','D','H','J'};
		Arrays.sort(arr);
		for(char c:arr)System.out.print(c);
		System.out.println();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
	}

}
