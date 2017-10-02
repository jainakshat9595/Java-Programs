// CodeChef : Life, the Universe, and Everything

import java.util.Scanner;

class Main_01 {
	public static void main(String args[]) {

		int x;
		Scanner sc = new Scanner(System.in);


		while(true) {
			x = sc.nextInt();
			if(x!=42) {
				System.out.println(x);
			}
			else {
				System.exit(0);
			}
		}
	}
}