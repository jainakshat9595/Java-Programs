import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] time_section = time.split(":");
        int hour = Integer.parseInt(time_section[0]);
        int min = Integer.parseInt(time_section[1]);
        int sec = Integer.parseInt(time_section[2].substring(0,2));
        String am_pm = time_section[2].substring(2);
        if((hour == 12)&&(am_pm.equals("AM"))) {
        	hour = 0;
        } else if((hour == 12)&&(am_pm.equals("PM"))) {
        	hour = 12;
        } else if(am_pm.equals("PM")) {
        	hour+=12;
        }
        //System.out.println(hour+":"+min+":"+sec);
        System.out.println(String.format("%05d",min));
    }
}
