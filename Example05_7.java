/**
 *  카테고리 : 반복문
 */
public class Example05_7 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			sum += (++i);
		}
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}
}