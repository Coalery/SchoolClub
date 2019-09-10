/**
 *  카테고리 : 연산자
 */
public class Example03_5 {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		System.out.println(a > b);
		System.out.println(a < b);
		
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		a = 6;
		b = 6;
		System.out.println(a == b);
		System.out.println(a != b);
		
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println(!true);
		System.out.println(!false);
	}
}