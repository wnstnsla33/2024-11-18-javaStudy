package com.sist.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Movie{
	public void display() {
		System.out.println("Movie:display()  call...");
	}
}
public class 예외처리_메모리할당_리플렉션 {

	public static void main(String[] args) {
//		Movie m = new Movie();
//		m.display();
		try {
			Class clsName = Class.forName("com.sist.exception.Movie");
			Object obj = clsName.getDeclaredConstructor().newInstance();
			Method[] methods = clsName.getDeclaredMethods();
			methods[0].invoke(obj, null);
			
		}catch (Exception e) {
			
		}
	}
}
