
class Student {
	
	int hakbun=1;
	String name="홍길동";
	String sex="남자";
	
	
	public Student(int hakbun, String name, String sex) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.sex = sex;
	}
	
	
	
}



public class 클래스_7 {
	public static void main(String[] args) {
		Student st = new Student(1, "기문수", null);
	}
}
