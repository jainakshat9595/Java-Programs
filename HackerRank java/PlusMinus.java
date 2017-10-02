import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int c_p = 0;
        int c_n = 0;
        int c_z = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            if(arr[arr_i] < 0) {
                c_n++;
            } else if(arr[arr_i] > 0) {
                c_p++;
            } else if(arr[arr_i] == 0) {
                c_z++;
            }
        }
        System.out.println(c_p);
        System.out.println((c_p/n));
    }
}
