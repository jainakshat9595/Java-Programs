// CodeChef : Atm

import java.util.Scanner;

class Main_02 {

	public static void main(String args[]) {

		int x;
		double y;
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextDouble();

		if((x%5 != 0 ) || ((x+0.50)>y)) {
			System.out.println(y);
		}
		else {
			System.out.println(y-x-0.50);
		}
		
	}
}