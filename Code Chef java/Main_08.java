// CodeChef : Sums in a triangle 

//Ques not clear : Not solved.

import java.util.*;
 
public class Main_08{
	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);
		
		int testCases = input.nextInt();
		int numberOfLines;

		int[] arrTemp;
		int[] arrSum = new int[testCases];

		int sum, max, maxIndex;

		for(int i=0; i<testCases; i++){
			sum = 0; maxIndex = 0;
			numberOfLines = input.nextInt();
			for(int j=1; j<=numberOfLines; j++) {
				max = 0; arrTemp = new int[j];
				for(int k=0; k<j; k++) {
					arrTemp[k] = input.nextInt();
				}
				for(int z=maxIndex; z<arrTemp.length; z++) {
					if(arrTemp[z] > max) {
						max = arrTemp[z];
						maxIndex = z;
					}
				}
				sum+=max;
			}
			arrSum[i] = sum;
		}

		for(int i=0; i<arrSum.length; i++) {
			System.out.println(arrSum[i]);
		}

		/*for(int i=0; i<testCases; i++) {
			x=1; sum=0;
			while(x <= arrForNumberOfElements[i]) {
				sum = arr[i][x];
				for(int ) {

				}
			}
		}

		for(int i=0; i<testCases; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}*/

	}
} 