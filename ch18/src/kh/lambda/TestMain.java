package kh.lambda;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// 구현객체를 생성한다.
		TestChild tc = new TestChild();
		
		// 부자관계
		Test test = tc;
		
		// 다형성 구현
		int kor = test.methodTest("국어");
		System.out.printf("국어점수는 = %d\n", kor);
		System.out.println("=====================");
		
		// 람다식 (인터페이스만 구현하면 됨)
		Test test2 = a -> {
			Scanner scan = new Scanner(System.in);
			System.out.printf("%s 점수요청: ", a);
			int value = Integer.parseInt(scan.nextLine());
			return value;
		};
		int eng = test2.methodTest("영어");
		System.out.printf("영어점수는 = %d\n", eng);
		System.out.println("=====================");
		
		System.out.println("The end");
	}

}
