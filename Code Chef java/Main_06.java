// CodeChef : Turbo Sort

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main_06 {

	public static void main(String args[]) throws NumberFormatException, IOException {

		int n, arr[];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());		

		arr = new int[n];

		StringBuffer sb = new StringBuffer();

		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}