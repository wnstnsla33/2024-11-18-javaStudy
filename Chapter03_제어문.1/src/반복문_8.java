
public class 반복문_8 {
	public static void main(String[] args) {
		int max=1, min=100;
		for(int i =1;i<=10;i++) {
			int num = (int)(Math.random()*100)+1;
			max = num>max?num:max;
			min = num<min?num:min;
		}
		System.out.println(max);
		System.out.println(min);
	}
}
