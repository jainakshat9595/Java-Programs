// CodeChef : Packaging Cupcakes

import java.util.*;
import java.io.*;

class Main_10 {

	public static void main(String args[]) throws NumberFormatException, IOException  {

		int t;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = Integer.parseInt(br.readLine());

		for(int i=0; i<t; i++) {
			long n;
			n = Integer.parseInt(br.readLine());
			
			System.out.println((n/2)+1);
		}

	}
}