class Student{
	String name;
	int age;
	int hakbun;
	
}
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student();
		hong.hakbun =1;
		hong.age=20;
		hong.name="홍길동";
		System.out.println("학번 : " +hong.hakbun);
		System.out.println("이름 : " +hong.name);
		System.out.println("나이 : " +hong.age);
		
		Student shim = new Student();
		hong.hakbun =2;
		hong.age=24;
		hong.name="심객체";
		System.out.println("학번 : " +shim.hakbun);
		System.out.println("이름 : " +shim.name);
		System.out.println("나이 : " +shim.age);
		
	}

}
