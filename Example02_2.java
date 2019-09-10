/**
 *  카테고리 : 변수
 */
public class Example02_2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0;
		
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp; // x 와  y 에 있는 값을 바꾼다.
		
		System.out.println("x:" + x + " y:" + y);
	}
}
