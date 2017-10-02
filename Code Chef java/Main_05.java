// CodeChef : Small Factorial

import java.util.Scanner;
import java.math.BigInteger;

class Main_05 {

	public static void main(String args[]) {

		int n;
		int[] t = new int[100];
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			t[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++) {
			BigInteger temp = BigInteger.ONE;
			for(int j=t[i]; j>0; j--) {
				temp = temp.multiply(BigInteger.valueOf(j));
			}
			System.out.println(temp);
		}
	}
}