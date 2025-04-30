package kh.lambda;

import java.util.Scanner;
// 2. 구현클래스를 설계한다.
public class TestChild implements Test{

	@Override
	// 3. 오버라이딩을 톻해서 설계한다.
	public int methodTest(String a) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("%s 점수요청: ", a);
		int value = Integer.parseInt(scan.nextLine());
		return value;
	}

}
