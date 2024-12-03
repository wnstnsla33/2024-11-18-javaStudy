import java.util.*;
public class 문자열_1 {
	static int[] arr;
	public static void main(String[] args) {
		//	int[] arr; 스태틱은 됨
		String[] names= {"홍길동","박문수","강감찬","이순신","김두한"};
		//문자열 > 데이터추가/수정(x) >검색
		//문자열 > 오라클 명령어 "SELECT * FROM table_name"
		//전체 출력
		//일반 for
		
		//for-each
		//라이브러리 확인
		List list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		String[] ids = {"admin","hong","park","kim","shim"};
		String[] pwds = {"1234","1234","1234","1234","1234"};
		
		System.out.println("ID를 입력:");
		String id= scan.next();
		
		System.out.print("pass word 입력");
		String pwd = scan.next();
		
		int count=0;
		int index=0;
		for(int i =0;i>ids.length;i++) {
			if(ids[i].equals(id)) {
				count++;
				index=i;
				break;
			}
			else {
				count=0;
				break;
			}
		}
		if(count==0) {
			System.out.println("ID가 존재하지 않습니다.");
		}
		else {
			if(pwds[index].equals(pwd)) {
				System.out.println(names[index]+"님 로그인 되었습니다.");
			}
			else {
				System.out.println("비밀번호가 틀립니다");
			}
		}
			
		
	}
}
