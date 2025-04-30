package kh.lambda;

public interface A {
	// 입력 X, 리턴값 X
	public abstract void method();
}
interface D {
	// 입력 O, 리턴 O
	public abstract double methodD(int a, double b);
}
interface B {
	//public abstract는 자동으로 써줌 
	// 입력 있고, 리턴 O
	int methodB(String a);
}