import java.util.*;

//Rotate Array by N Elements

class RotateArrayByN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int[] arr = new int[100];

			int n = sc.nextInt();
			int d = sc.nextInt();
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();	
			}
			int[] arrTemp = new int[d];
			for(int i=0; i<d; i++) {
				arrTemp[i] = arr[i];
			}
			for(int i=d; i<n; i++) {
				arr[i-d] = arr[i];
			}
			for(int i=0; i<d; i++) {
				arr[i+n-d] = arrTemp[i];
			}
			
			for(int i=0; i<n; i++) {
				System.out.print(arr[i]+" ");
			}

			System.out.print("\n");
			t--;
		}
	}	
}
