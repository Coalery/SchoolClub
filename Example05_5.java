import java.util.Scanner;

/**
 *  카테고리 : 반복문
 */
public class Example05_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int sum = 0;
		boolean flag = true;
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		
		while(flag) {
			System.out.print(">> ");
			num = Integer.parseInt(scanner.nextLine());
			
			if(num != 0)
				sum += num;
			else
				flag = false;
		}
		System.out.println("합계 : " + sum);
	}
}