import java.util.*;

//Max Sum

class MaxSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int[] arr = new int[1001];

			int n = sc.nextInt();
			int k = sc.nextInt();
			for(int i=0; i<n; i++) {
				int temp = sc.nextInt();
				arr[temp]++;
			}

			for(int i=1000; i>=0; i--) {
				if(k>0) {
					if(arr[i]>0) {
						for(int j=0; j<arr[i]; j++) {
							if(k>0) {
								System.out.print(i+" ");
								k--;
							}
						}
					}
				}
			}
			System.out.print("\n");
			t--;
		}
	}	
}
