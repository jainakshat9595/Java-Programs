import java.util.*;

//Minimum Difference Pair

class MinimumDifferencePair {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int[] arr = new int[100];

			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}

			int minDiff = 99999;

			for(int i=0; i<n; i++) {
				for(int j=i+1; j<n; j++) {
					int diff = Math.abs(arr[i]-arr[j]);
					if(diff < minDiff) {
						minDiff = diff;
					}
				}
			}
			System.out.println(minDiff);
			t--;
		}
	}	
}
