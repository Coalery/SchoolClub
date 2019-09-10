/**
 *  카테고리 : 반복문
 */
public class Example05_4 {
	public static void main(String[] args) {
		int i = 11;
		System.out.println("카운트다운을 시작합니다.");
		
		while(i-- != 0) {
			System.out.println(i);
			try { Thread.sleep(1000); } catch (InterruptedException e) {} // 1초 쉰다.
		}
		System.out.println("GAME OVER");
	}
}