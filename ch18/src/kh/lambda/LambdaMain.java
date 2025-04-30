package kh.lambda;

import java.util.Scanner;

public class LambdaMain {

	public static void main(String[] args) {
		// 임시객체 부모 = new 자식()
		// 입력 X, 출력 X => 람다식
		A a = () -> System.out.println("입력 X, 리턴값 X"); 
		
		//부모 추상메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동이 된다. 
		a.method();
		System.out.println("==========================");
		// 입력 O, 리턴 O
		D d = (e, f) -> e*f;
		
		//부모 추상메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동이 된다.
		double value = d.methodD(10, 12.14);
		System.out.printf("d.method(10, 12.14) = %.2f\n", value);
		System.out.println("==========================");
		// 입력 X, 리턴 O
		B b = (name) -> {
			Scanner scan = new Scanner(System.in);
			System.out.printf("당신의 %s 점수 입력:", name);
			int _value = Integer.parseInt(scan.nextLine());
			return _value;
		};
		int _value = b.methodB("국어");
		System.out.printf("당신의 점수는 %d점 입니다.\n", _value);
		int value2 = b.methodB("영어");
		System.out.printf("당신의 점수는 %d점 입니다.\n", value2);
		//부모 추상메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동이 된다.
		
		System.out.println("The end");
	}
}
