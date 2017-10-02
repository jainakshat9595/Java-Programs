import java.util.*;

//Reverse Sub Array

class ReverseSubArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int[] arr = new int[100];
			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			int left = sc.nextInt();
			int right = sc.nextInt();
			left = left-1;
			right = right-1;
			while(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			for(int i=0; i<n; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
			t--;
		}
	}	
}
