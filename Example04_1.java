import java.util.Scanner;

/**
 *  카테고리 : 조건문
 */
public class Example04_1 {
	public static void main(String[] args) {
		int input;
		System.out.print("숫자를 하나 입력하세요. > ");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input == 0)
			System.out.println("입력하신 숫자는 0 입니다.");
		
		if(input != 0)
			System.out.println("입력하신 숫자는 0 이 아닙니다.");
			System.out.println("입력하신 숫자는 " + input + " 입니다."); // 중괄호가 되어있지 않기때문에 무조건 작동되는 줄이다.
		
		if(input != 0) {
			System.out.println("입력하신 숫자는 0 이 아닙니다.");
			System.out.println("입력하신 숫자는 " + input + " 입니다.");
		}
	}
}