/*
 * 옅은 복사 주소에 의한 참조
 * 깊은 복사 새로운 배열 생성
 */

public class 배열정리 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] arr_copy=arr;
		//주소 값이 같으면 같은 데이터를 제어;
		
		
		//깊은 복사
		int[] arr_deeparr=arr.clone();
	}

}
