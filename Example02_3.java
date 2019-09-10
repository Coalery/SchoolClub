/**
 *  카테고리 : 변수
 */
public class Example02_3 {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println(7 + 7 + ""); // 숫자가 먼저 더해졌으므로 14 출력.
		System.out.println("" + 7 + 7); // "" + 7 이 먼저 처리되면서 "7" + 7 이므로 77 출력.
	}
}
