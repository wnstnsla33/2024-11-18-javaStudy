/*
 * 
 * continue \
 * 반복문에서만 사용가능
 * 조건문/선택문에서는 사용 불가능
 * 특정부분을 제외할때 사용
 *  for문에서는 증가식으로 이동
 *  while문에서는 조건식으로 이동
 *  
 *  break,continue가 있는 경우에 다음에는 소스 코딩할 수 없다.
 * 	
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5)continue;
			System.out.print(i+" ");
		}
	}
}
