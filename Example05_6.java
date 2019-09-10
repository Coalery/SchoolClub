/**
 *  카테고리 : 반복문
 */
public class Example05_6 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.print("i = " + i + " ");
			
			int tmp = i;
			
			do {
				if(tmp%10%3 == 0 && tmp%10 != 0)
					System.out.print("짝");
			} while((tmp /= 10) != 0);
			
			System.out.println();
		}
	}
}
