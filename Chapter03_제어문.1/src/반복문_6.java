import java.io.FileReader;

public class 반복문_6 {
	
	public static void main(String[] args) {
		FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
		String movie = "";
		int i =0;
		StringBuffer sb = new StringBuffer();
		while((i=fr.read())!=-1)
		{
			sb.append((char)i);
		}
	}

}
