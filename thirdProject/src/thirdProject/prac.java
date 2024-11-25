package thirdProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			
		
	}
	 static int[]  solution(int n, int left, int right) {
		 int arr = right -left+1;
		 int[] answer = new int[arr];
		 int[][] temp = new int[n][n];
		 for(int i = 0;i<n;i++) {
			 for(int j=0;j<=i;j++) {
				 temp[i][j]=i>=j?i+1:j+1;
			 }
		 }
		 int[] ans = new int[n*n];
		 int z= 0;
		 for(int i= 0 ;i<n;i++) {
			 for(int j=0;j<n;j++) {
				ans[z]=temp[i][j];
				z++;
			 }
		 }
		 for(int i =0; )
		 
		 return answer;
		 
	 }
}

