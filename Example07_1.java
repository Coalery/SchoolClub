/**
 *  카테고리 : 메서드
 */
public class Example07_1 {
	
	public static int add(int a, int b) { // static 메서드에서 호출하는 메서드도 static 이 붙어야 한다.
		return a + b;
	}
	
	public static int minus(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static float divide(int a, int b) {
		return a / (float)b;
	}
	
	public static void hi() {
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		System.out.println(add(5, 3));
		System.out.println(minus(5, 3));
		System.out.println(multiply(5, 3));
		System.out.println(divide(5, 3));
		hi();
	}
}
