import java.util.*;
import java.io.BufferedReader;

//Remove Characters

class RemoveCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {

			boolean[] charArray = new boolean[26];

			String str1 = sc.next();
			String mask = sc.next();

			for(int i=0; i<mask.length(); i++) {
				charArray[mask.charAt(i) - 'a'] = true;
			}

			for(int i=0; i<str1.length(); i++) {
				if(!charArray[str1.charAt(i) - 'a']) 
					System.out.print(str1.charAt(i));
			}

			System.out.print("\n");
			t--;
		}
	}	
}
