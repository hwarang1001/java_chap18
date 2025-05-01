package kh.predicate;

import java.util.function.Predicate;

public class PredicateMain {

	public static void main(String[] args) {
		// Predicate<T> => boolean test(T t): 추상메소드 => 람다식
		Predicate<String> pre = t -> {
				boolean flag = false;
				try {					
					Integer.parseInt(t);
					flag = true;
				}catch(NumberFormatException e){
					flag = false;
				}catch(Exception e) {
					flag = false;
				}
				
				return flag;
		};
		boolean flag = pre.test("123");
		System.out.printf("%s\n",(flag == true)?("숫자로 변환 O"):("숫자로 변환 X"));
		
		System.out.println("The end");
		
		
	}// end of main

}
