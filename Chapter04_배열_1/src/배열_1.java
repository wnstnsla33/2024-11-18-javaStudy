/*
 * 데이터를 관리하기 쉽게 데이터 묶어서 사용
 * 캐시를 통해 배열에 있는 데이터에 접근
 * 
 * int a=10>arr[0]
 * arr[0]=10
 * arr[1]=100;
 *  > 연속적으로 메모리 구조
 *    인덱스 번호를 이용해서 접근
 *    1. 배치 > 인덱스 번호 부여
 *    2. 인덱스 번호를 이용해서 데이터 값수정
 */

import java.util.Scanner;

public class 배열_1 {
	public static void main(String[] args) {
		
		int[] arr = {13,23,13,421,123};
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
			
}
