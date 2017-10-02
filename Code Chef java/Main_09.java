// CodeChef : Ambiguous Permutations

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main_09 {

	public static void main(String args[]) throws NumberFormatException, IOException {

		int n, num;

		int[] arr = new int[1000001];
		int[] arrRev = new int[1000001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//StringBuffer sb = new StringBuffer();

		num = Integer.parseInt(br.readLine());
		
		while(num != 0) {
			
			String str1 = br.readLine();	
			String[] str2;
			str2 = str1.split(" ");
			for(int k=0; k<str2.length; k++){
				arr[k] = Integer.parseInt(str2[k]);
			}
			for(int k=num-1; k>=0; k--) {
				arr[k+1] = arr[k];
 			}

			for(int k=1; k<=num; k++) {
				arrRev[arr[k]] = k;
			}

			boolean flag = true;
			for(int k=1; k<=num; k++) {
				if(arr[k] == arrRev[k]) {
					continue;
				}
				else {
					flag = false;
					break;
				}
			}

			if(flag) {
				//sb.append("ambiguous");
				System.out.println("ambiguous");
			}
			else {
				//sb.append("not ambiguous");
				System.out.println("not ambiguous");
			}
			//sb.append("\n");

			num = Integer.parseInt(br.readLine());

		}

		//System.out.println(sb);

	}
}