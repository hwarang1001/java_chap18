package kh.form;

public class FormMain {

	public static void main(String[] args) {
		// 학생성적프로그램 테이블
		System.out.printf("%-10s %-5s %-5s %-5s %-5s %-5s %-9s\n", "이름", "age", "kor", "eng", "math", "total", "avg");			
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%-10s %-5d %-5d %-5d %-5d %-5d %-6.2f\n", "홍길동", 10, 100, 90, 80, 270, 80.45);			
		}
		
		System.out.println("The end");
	}

}
