
public class 자바배열_문제풀이1 {
	public static void main(String[] args) {
		int[] score = {100,90,85};
		int sum=0;
		for(int i=0;i<3;i++	) {
			sum+=score[i];
		}
		int max=0;
		int min=100000;
		sum =0;
		int[] arr= {50,45,35,12,70};
		for(int i=0;i<5;i++) {
			sum+=arr[i];
			max=arr[i]>max?arr[i]:max;
			min=arr[i]<min?arr[i]:min;
			
		}
		int maxSa =0;
		int minSa =0;
		for(int i=0;i<5;i++) {
			if(max==arr[i]) maxSa=i+1;
			if(min==arr[i]) minSa=i+1;
		}
		System.out.println("총점은"+sum+"입니다, 평균은 "
				+ (float)sum/5+"입니다");
		System.out.println("실적이 제일 높은 사원 사번 : "+maxSa+"실적 : "+max);
		System.out.println("실적이 제일 낮은 사원 사번 : "+minSa+"실적 : "+min);
		
		int[] arr2 = new int[10];
		for(int i=0;i<100;i++) {
			arr2[(int)(Math.random()*10)]++;
		}
		for(int i:arr2)System.out.print(i+"\t");
	}

}
