/**
 *  카테고리 : 연산자
 */
public class Example03_3 {
	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		
		char zero = '0';
		char two = '2';
		
		System.out.println("'" + d + "' - '" + a + "' = " + (d-a));
		System.out.println("'" + two + "' - '" + zero + "' = " + (two-zero)); // char 형 끼리 연산이 가능하다.
		System.out.println("'" + a + "' = " + (int)a);
		System.out.println("'" + d + "' = " + (int)d);
		System.out.println("'" + zero + "' = " + (int)zero);
		System.out.println("'" + two + "' = " + (int)two);
	}
}