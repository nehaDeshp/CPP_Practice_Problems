package numberlogics;

import java.util.Scanner;

public class Dec2Bin {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        String bin = "";
        while(n/2 != 0){
            bin = n%2 + bin;
            n=n/2;
        }
        bin = n+bin;
        System.out.println(bin);
        boolean found = false;
        int max=0;
        for(int i=0;i<bin.length();i++){
        	if(bin.charAt(i) == '1')
        		count++;
        	else
        		count = 0;
        	if(max <= count)
        		max = count;
		}	
        System.out.println(max);
	}
}

