import java.util.*;

//Leaders in an Array

class LeadersArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			int[] arr = new int[100];
			int[] arrMap = new int[101];
			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=0; i<n; i++) {
				int flag = 0;
				for(int j=i+1; j<n; j++) {
					if(arr[i]<arr[j]) {
						flag = 1;
						break;
					}
				}
				if((flag == 0)&&(arrMap[arr[i]] == 0))  {
					arrMap[arr[i]]++;
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println("");
			t--;
		}
	}	
}
