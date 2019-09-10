/**
 * 카테고리 : 반복문
 */
public class Example05_8 {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3 == 0)
				continue;
			System.out.println(i);
		}
	}
}