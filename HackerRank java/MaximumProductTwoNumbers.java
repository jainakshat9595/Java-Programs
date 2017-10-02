import java.util.*;

//Maximum product of 2 numbers

class MaximumProductTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int[] arr = new int[50];
			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			int firstMax = -1;
			int secondMax = -1;

			if(n == 1) {
				System.out.println(arr[0]);
			} else if(n == 2) {
				System.out.println(arr[0]*arr[1]);
			} else {
				for(int i=0; i<n; i++) {
					if(arr[i] > firstMax) {
						secondMax = firstMax;
						firstMax = arr[i];
					} else if((arr[i] > secondMax)&&(arr[i]!=firstMax)) {
						secondMax = arr[i];
					}
				}
				if(secondMax == -1) {
					System.out.println(firstMax);
				} else {
					System.out.println(firstMax*secondMax);
				}
			}

			t--;
		}
	}	
}
