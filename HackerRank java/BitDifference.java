import java.util.*;

//Bit Difference

class BitDifference {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int diff = a ^ b;
			System.out.println(Integer.bitCount(diff));
			t--;
		}
	}	
}
