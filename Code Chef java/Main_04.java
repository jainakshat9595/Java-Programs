// CodeChef : Factorial

import java.util.Scanner;

class Main_04 {

	public static void main(String args[]) {

		long n;
		long[] t = new long[10000000];
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextLong();
		
		for(int i=0; i<n; i++) {
			t[i] = sc.nextLong();
		}

		for (int i=0; i<n; i++) {
			int temp = 0;
			while(t[i]>0) {
				temp += t[i]/5;
				t[i] = t[i]/5;
			}
			System.out.println(temp);	
		}
	}
}