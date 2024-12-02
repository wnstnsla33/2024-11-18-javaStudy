
public class 배열연습문제_3 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,50,3,60,-3};
		System.out.println(arr[1]);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==60)System.out.println(i);
		}
		
	}
	
}
