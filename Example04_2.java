import java.util.Scanner;

/**
 *  카테고리 : 조건문
 */
public class Example04_2 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요. > ");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);
		
		if(score >= 90)
			grade = 'A';
		else if(score >= 80) // 위에서 A 가 나오지 않았더라면 적어도 90 미만이다.
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else
			grade = 'D';
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}
