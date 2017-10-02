// CodeChef : Cutting Recipes

import java.util.*;
import java.io.*;

class Main_13 {

	public static void main(String args[]) throws NumberFormatException, IOException  {

		int t;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();

		t = Integer.parseInt(br.readLine());

		for(int i=0; i<t; i++) {
			
			String ip = br.readLine();
			String[] ip_Word = ip.split(" ");
			int[] ip_Word_int = new int[ip_Word.length-1];
			//System.out.println(ip_Word_int.length);

			for(int j=1; j<ip_Word.length; j++) {
				ip_Word_int[j-1] = Integer.parseInt(ip_Word[j]);
			}

			int min=ip_Word_int[0];
			for(int j=1; j<ip_Word_int.length; j++) {
				if(ip_Word_int[j]<min) {
					min = ip_Word_int[j];
				}
			}

			int[] op_int = new int[ip_Word_int.length];
			Boolean flag = true;
			for(int j=0; j<ip_Word_int.length; j++) {
				if(ip_Word_int[j] % min == 0) {
					op_int[j] = ip_Word_int[j] / min;
					continue;
				}
				else {
					flag = false;
					break;
				}
			}

			if(flag) {
				for(int j=0; j<op_int.length; j++) {
					if(j == op_int.length-1) 
						sb.append(op_int[j]);
					else
						sb.append(op_int[j]+" ");
				}
			}
			else {
				for(int j=0; j<ip_Word_int.length; j++) {
					if(j == ip_Word_int.length-1) 
						sb.append(ip_Word_int[j]);
					else
						sb.append(ip_Word_int[j]+" ");
				}
			}

			System.out.println(sb);
			sb.append("\n");

		}

		//System.out.println(sb);

	}
}