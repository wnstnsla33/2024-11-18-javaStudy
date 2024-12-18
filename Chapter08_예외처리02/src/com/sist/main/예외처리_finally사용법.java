package com.sist.main;

import java.io.FileReader;
import java.io.IOException;

public class 예외처리_finally사용법 {

	 public static void main(String[] args) {
//		FileReader fr = null;
//		try {
//			fr=  new FileReader("c:\\javaDev\\seoul_nature.txt");
//			int i =0;
//			while((i=fr.read())!=-1) {
//				System.out.print((char)i);
//			}
//		}catch (IOException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}finally {
//			try {
//				fr.close();
//			}catch (IOException e) {
//				// TODO: handle exception
//			}
//		}
		 try(FileReader fr = new FileReader("c:\\javaDev\\seoul_nature.txt")){
			 int i=0;
			 while((i=fr.read())!=-1) {
				 System.out.print((char)i);
			 }
		 }catch (Exception e) {
			 System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}
}
