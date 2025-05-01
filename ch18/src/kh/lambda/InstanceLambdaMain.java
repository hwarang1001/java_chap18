package kh.lambda;

public class InstanceLambdaMain {

	public static void main(String[] args) {
		// 람다식(함수형 인터페이스 -> 인스턴스 메소드 System.out.println())
		C c = a -> System.out.println(a);

		C c2 = System.out::println;

		c.methodC(10);
		c2.methodC(100);
		// ==================================
		System.out.println("=======================");
		A a = () -> BObject.bcd();
		A a2 = BObject::bcd;

		a.method();
		a2.method();
		// ==================================
		System.out.println("=======================");
		ATest aTest = (b, k) -> b.bcd(k);
		ATest aTest2 = BObject2::bcd;
		
		aTest.abc(new BObject2(), 1000);
		aTest2.abc(new BObject2(), 2000);
		
		
		System.out.println("the end!");
	}

}
