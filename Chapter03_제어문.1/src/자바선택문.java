
public class 자바선택문 {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1;
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
		}
		switch (month) {
		case 6: case 7: case 8:
			System.out.println("여름");
		}
		switch (month) {
		case 9: case 10: case 11:
			System.out.println("가을");
		}
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("겨울");
		}
	}
}
