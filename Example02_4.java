import java.util.Scanner;

/**
 *  카테고리 : 변수
 */
public class Example02_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요. > ");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); // 문자열을 숫자로 변환한다.
		
		System.out.println("입력내용 : " + input);
		System.out.println(num + 1);
	}
}