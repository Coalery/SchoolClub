/**
 *  카테고리 : 연산자
 */
public class Example03_1 {
	public static void main(String[] args) {
		int i = 5;
		i++ ; // i = i + 1; 과 같다.
		System.out.println(i);
		
		int i1 = 5, i2 = 5;
		System.out.println(i1++); // 후위 증가연산자
		System.out.println(++i2); // 전위 증가연산자
		
		System.out.println(i1);
		System.out.println(i2);
	}
}