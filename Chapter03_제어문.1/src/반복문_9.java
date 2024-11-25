
public class 반복문_9 {
	public static void main(String[] args) {
		
		int dcnt=0,scnt=0;
		
		for(int i=1; i<=10;i++) {
			
			char c= 'A';
			int no = (int)(Math.random()*2);
			if(no==1)
				c=(char)((Math.random()*26)+65);
			else 
				c=(char)((Math.random()*26)+97);
			System.out.println(c+" ");
			
			if (c>='A' && c<='Z' )dcnt++;
			else scnt++;
		}
		System.out.println("소문자 갯수:" +scnt);
		System.out.println("대문자 갯수:" +dcnt);
		
	}

}
