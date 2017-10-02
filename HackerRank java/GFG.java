import java.util.*;

//Missing numbers in array

class GFG {

	public static int checkMissing(int[] arr, int n) {
		if(arr[0] != 1) {
			return 1;
		}
		for(int i=1; i<n-1; i++) {
			if(arr[i] != arr[i-1]+1) {
				return arr[i]-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = new int[999];

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int n = sc.nextInt();
			for(int i=0; i<n-1; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(checkMissing(arr, n));

			t--;
		}
	}	
}
