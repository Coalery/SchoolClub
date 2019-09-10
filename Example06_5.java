/**
 *  카테고리 : 배열
 */
public class Example06_5 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] = (int)(Math.random() * 10));
		System.out.println();
		
		for(int i=0; i<arr.length - 1; i++)
			for(int j=i; j<arr.length; j++)
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]);
		System.out.println();
	}
}