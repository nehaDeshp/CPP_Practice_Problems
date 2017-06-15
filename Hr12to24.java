package strings;
import java.io.*;
import java.util.*;

public class Hr12to24 {
   public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	   Scanner sc = new Scanner(System.in); 
	   String hr12 = sc.next();

	String date[] = hr12.split(":");
	int hrs = Integer.parseInt(date[0]);
	System.out.println(hrs);
	System.out.println(date[2].substring(2));
	System.out.println(date.length);
	if(hrs == 12){
	    if(date[2].substring(2).equals("AM")){
	        hrs = 12;
	    }
	    else{
	        hrs = 00;
	    }
	}
	else{
	    hrs = hrs+12;
	}
	String hr24 = String.valueOf(hrs)+":"+ date[1]+":"+ date[2].substring(0,2); 
	 
	System.out.println(hr24);
   }
}