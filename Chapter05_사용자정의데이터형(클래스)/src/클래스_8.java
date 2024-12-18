
/*
 * int a=1;
 * static int b=0;
 * static void asdf{
 *  b 사용 가ㅡㄴㅇ
 * }
 * void asdf{
 * 	ab 사용 가능
 * }
 */
class Member{
	int no=100;
	Member(){
		int no = 200;
		System.out.println("no="+no+this.no);
	}
	
}
public class 클래스_8 {

}
