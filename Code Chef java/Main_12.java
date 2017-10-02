// CodeChef : Ciel and Receipt

import java.util.*;
import java.io.*;

class Main_12 {

	public static void main(String args[]) throws NumberFormatException, IOException  {

		int t;
		int[] array = {1,2,4,8,16,32,64,128,256,512,1024,2048};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();

		t = Integer.parseInt(br.readLine());

		for(int i=0; i<t; i++) {
			
			int num = Integer.parseInt(br.readLine());
			int count = 0;
			int maxindex = 11;

			for(int k=0; k<array.length; k++) {
				if(num<array[k]) {
					maxindex = k-1;
					break;
				}
			}
			
			while(num!=0) {

				if(num >= array[maxindex]) {
					num = num - array[maxindex];
					count++;
				}
				else
					maxindex--;
			}


			sb.append(count);
			sb.append("\n");

		}

		System.out.println(sb);

	}
}