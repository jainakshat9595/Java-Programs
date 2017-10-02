// CodeChef : Transform the Expression

import java.util.*;
import java.io.*;

class Main_11 {

	public static void main(String args[]) throws NumberFormatException, IOException  {

		int t;

		char[] op_stack = new char[401];
		int top_opStack = -1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();

		t = Integer.parseInt(br.readLine());

		for(int i=0; i<t; i++) {
			StringBuffer sb_temp = new StringBuffer();
			String ip = br.readLine();

			for(int j=0; j<ip.length(); j++) {
				char temp;
				char ch = ip.charAt(j);
				if((ch=='(')||(ch=='+')||(ch=='-')||(ch=='*')||(ch=='/')||(ch=='^')) {
					top_opStack++;
					op_stack[top_opStack] = ch;
				}
				else if(ch==')'){
					while(op_stack[top_opStack] != '(') {
						temp = op_stack[top_opStack];
						sb_temp.append(temp);
						top_opStack--;
					}
					top_opStack--;
				}
				else {
					sb_temp.append(ch);
				}
			}

			sb.append(sb_temp);
			sb.append("\n");

		}

		System.out.println(sb);

	}
}