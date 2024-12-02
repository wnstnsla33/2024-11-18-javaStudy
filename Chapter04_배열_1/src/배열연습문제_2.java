
public class 배열연습문제_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*11);
			sum+=arr[i];
		}
		for(int i :arr)System.out.print(i+" ");
		System.out.println((float)sum/10);
		
		int[] num = { 94, 85, 95, 88, 90 };
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i =0;i<num.length;i++	) {
			max=num[i]>max?num[i]:max;
			min=num[i]<min?num[i]:min;
		}
		System.out.println("max : "+max +"\nmin :"+min);
		
		
	}
	
	
}
