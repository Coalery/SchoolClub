/**
 *  카테고리 : 연산자
 */
public class Example03_2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		System.out.println(a + " / " + (float)b + " = " + (a/(float)b)); // 분모가 float 형이다.
		System.out.println(a + " % " + b + " = " + (a%b));
	}
}