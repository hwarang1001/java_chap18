package kh.consumer;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerMain {

	public static void main(String[] args) {
		// 인터페이스 -> 구현클래스 -> 구현객체 -> 부 자관계 -> 부.추상메소드
		// Consumer x -> x -> 구현객체(부자관계) -> 부.추상메소드
		Consumer<String> con = t -> System.out.printf("%s님 환영합니다.\n", t);
	
		con.accept("홍길동");
		con.accept("구길동");
		con.accept("저길동");
		System.out.println("=======================================");
		Consumer<Integer> con2 = t -> {
			System.out.printf("%d단 출력\n", t);
			for(int i = 0; i < 9; i++) {
				System.out.printf("%d * %d = %d\n", t, i+1, t*(i+1));
					
			}
		};
		con2.accept(5);
		System.out.println("=======================================");
		con2.accept(6);
		System.out.println("=======================================");
		con2.accept(7);
		System.out.println("=======================================");
		
		IntConsumer icon = t -> {
			System.out.printf("%d단 출력\n", t);
			for(int i = 0; i < 9; i++) {
				System.out.printf("%d * %d = %d\n", t, i+1, t*(i+1));
			}	
		};
		icon.accept(5);
		System.out.println("=======================================");
		
		BiConsumer<String, Integer> bicon = (name, age) -> System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);
		bicon.accept("김동진", 60);
		bicon.accept("김화랑", 27);
		System.out.println("=======================================");
		
		System.out.println("The end");
	}

}

