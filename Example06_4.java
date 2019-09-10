/**
 *  카테고리 : 배열
 */
public class Example06_4 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++)
			numArr[i] = i;
		for(int i=0; i<100; i++) { // 섞는다.
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i]);
		System.out.println();
	}
}