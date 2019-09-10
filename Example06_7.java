/**
 *  카테고리 : 배열
 */
public class Example06_7 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 97, 100},
				{20, 21, 20},
				{30, 30, 36},
				{40, 49, 40}
		};
		int sum = 0;
		
		for(int i=0; i<score.length; i++)
			for(int j=0; j<score[i].length; j++) {
				System.out.println("score[" + i + "][" + j + "]=" + score[i][j]);
				sum += score[i][j];
			}
		System.out.println(sum);
	}
}