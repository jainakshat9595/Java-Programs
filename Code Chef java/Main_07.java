// CodeChef : The Lead Game

import java.util.*;
import java.util.*;
 
public class Main_07{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int aSum = 0, bSum =0, diff=0, win=1;
		while(n>0){
			int z=1, max=0;
			aSum += input.nextInt();
			bSum += input.nextInt();
			
			if(aSum>bSum){
				max = aSum - bSum;
			}
			else if(bSum>aSum){
				z=2;
				max = bSum - aSum;
			}
			if(max>diff){
				win = z;
				diff = max;
			}
			n--;
		}
		System.out.println(win +" " + diff);
		input.close();
		
	}
} 