import java.util.*;

//Reverse An Array

class ReverseAnArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int[] arr = new int[100];
			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			int start = 0;
			int end = n-1;
			while(start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			for(int i=0; i<n; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
			t--;
		}
	}	
}
