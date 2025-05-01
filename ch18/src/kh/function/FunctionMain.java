package kh.function;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		// Function<T, R> => R apply(T t) 추상메소드 
		String name = "홍길동";
		Function<String, Integer> func = t -> t.length();
		int length = func.apply(name);
		System.out.printf("%s님의 리턴된 문자열의 길이는 %d입니다.\n", name, length);
		
		
		
		
		
	}

}
