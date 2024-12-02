import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 배열응용_4 {
	static void sort(int[] arr) {
		int temp =0;
		for(int i= 0;i<5;i++) {
			for(int j=i;j<5;j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i =0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전");
		for(int i :arr)System.out.print(i +" ");
		
		//선택 정렬
		System.out.println();
		int temp =0;
		for(int i= 0;i<5;i++) {
			for(int j=i;j<5;j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int i :arr)System.out.print(i +" ");
		
		
		
		
		
		for(int i =0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		
		System.out.println("정렬 전");
		for(int i :arr)System.out.print(i +" ");
		
		//버블 정렬
		for(int i =0;i<5;i++) {
			for(int j= 0;j<4-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		for(int i :arr)System.out.print(i +" ");
		
		
		
		//삽입정렬
		for(int i =0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		
		System.out.println("정렬 전");
		for(int i :arr)System.out.print(i +" ");
		Arrays.sort(arr);
		System.out.println("");
		for(int i :arr)System.out.print(i +" ");
		
		
	}
	
	

}
