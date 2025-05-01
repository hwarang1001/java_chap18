package kh.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		// 인터페이스(추상메서드1개) -> 구현클래스(오버라이딩) -> 부모 = 자식구현객체 -> 부모.추상메소드
		// Supplier<T>(T get() : 추상메소드) -> 구현클래스(X) -> 부모 = 자식구현객체 -> 부모.추상메소드(람다식표현)
		Supplier<String> sup = () -> {
			Scanner scan = new Scanner(System.in);
			System.out.print("이름입력: ");
			String name = scan.nextLine();
			return String.format("%s님 질문을 하신 다신은 멋쟁이!!", name);
		};
		String value = sup.get();
		System.out.println(value);
		System.out.println("The end");
		
		
	}

}
