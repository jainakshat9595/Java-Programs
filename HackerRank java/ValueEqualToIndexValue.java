import java.util.*;

//Value Equal to Index Value

class ValueEqualToIndexValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int[] arr = new int[51];
			int n = sc.nextInt();
			for(int i=1; i<=n; i++) {
				arr[i] = sc.nextInt();
			}
			int flag = 0;
			for(int i=1; i<=n; i++) {
				if(arr[i] == i) {
					flag = 1;
					System.out.print(i+" ");
				}
			}
			if(flag == 0) {
				System.out.print("Not Found");
			}
			System.out.println("");
			t--;
		}
	}	
}
