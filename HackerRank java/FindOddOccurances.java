import java.util.*;

//Find Odd Occurances

class FindOddOccurances {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int[] arr = new int[202];

			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}

			int res=0;

			for(int i=0; i<n; i++) {
				res = res ^ arr[i];
			}

			System.out.println(res);
			t--;
		}
	}	
}
