/**
 *  카테고리 : 배열
 */
public class Example06_6 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] = (int)(Math.random() * 10));
		System.out.println();
		
		for(int i=0; i<arr.length; i++)
			counter[arr[i]]++;
		for(int i=0; i<arr.length; i++)
			System.out.println(i + " 의 개수 : " + counter[i]);
	}
}