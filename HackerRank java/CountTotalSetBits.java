import java.util.*;

//Count Total Set Bits

class CountTotalSetBits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int n = sc.nextInt();
			long count = 0;
			for(int i=1; i<=n; i++) {
				count = count + Integer.bitCount(i);			
			}
			System.out.println(count);
			t--;
		}
	}	
}
