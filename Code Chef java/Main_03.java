// CodeChef : Enormous Input Test

import java.util.Scanner;

class Main_03 {

	public static void main(String args[]) {

		long n, k;
		long[] t = new long[10000000];
		Scanner sc = new Scanner(System.in);
		int temp = 0;

		n = sc.nextLong();
		k = sc.nextLong();
		
		for (int i=0; i<n; i++) {
			t[i] = sc.nextLong();
			if(t[i]%k == 0) {
				temp++;
			}
		}
		System.out.println(temp);
	}
}