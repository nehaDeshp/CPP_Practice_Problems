package numberlogics;

import java.util.Scanner;

public class NumericString {

    static int getMagicNumber(String s, int k, int b, int m){
        // Complete this function
        /*Convert String into an integer Array*/
    	int arr[] = new int[s.length()];	
    	if(s.length()>0){
	        int len=0;
	        
	        int lastChar=0;
	        while(len < s.length()-k+1){
	        	lastChar = len+k;
	            arr[len] = Integer.parseInt(s.substring(len, lastChar));
	            System.out.println("Array Values : " +arr[len]);
	            len++;
	        }
    	}
        /*Convert to base 10 from base b*/
        int ret = 0;
        for(int i=0;i<arr.length;i++){
        	int n = arr[i];
        	int exp=0;
        	int total =0;
        	while(n != 0){
        		total = (int) (total + (n%10 * Math.pow(b,exp)));
        		exp++;
        		n = n /10;
        	}
        	total = total % m;
        	ret = ret+total;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
       int result = getMagicNumber(s, k, b, m);
       System.out.println(result);
    }
}
