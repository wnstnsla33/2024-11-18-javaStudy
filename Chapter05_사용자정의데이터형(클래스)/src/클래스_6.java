/*
 * 일반 데이터형과 동일하게 사용 > 사용자 정의 데이터 형
 */

class Member{
	String id;
	String name;
	String sex;
	String address;
	String phone;
}
class MemberSystem{
	static Member[] members = new Member[10];
	//스태틱이 없을 경우 members의 객체를 생성시 다른 배열이 생기지만 static있을 경우 같은 배열
	 
}
public class 클래스_6 {
	public static void main(String[] args) {
		MemberSystem ms1= new MemberSystem();
		ms1.members[0]=new Member();
		ms1.members[0].id="hong";
		ms1.members[0].name="홍길동";
		System.out.println("아이디:"+ms1.members[0].id);
		System.out.println("이름:"+ms1.members[0]);
		
		MemberSystem ms2= new MemberSystem();
		ms2.members[0]= new Member();
		
		
	}

}
