/**
 *  카테고리 : 반복문
 */
public class Example05_1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println("1부터 " + i + " 까지의 합 : " + sum);
		}
	}
}
