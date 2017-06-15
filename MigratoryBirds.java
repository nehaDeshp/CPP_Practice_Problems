package numberlogics;

import java.util.*;

public class MigratoryBirds {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        
        // your code goes here
        int max=0;
		 HashMap<Integer,Integer> birdsCount = new HashMap<Integer,Integer>();
		 SortedSet<Integer> list;
	     for(int i=0;i<types.length;i++){
	     	if(birdsCount.containsKey(types[i])){
	             birdsCount.put(types[i], birdsCount.get(types[i])+1);
	             if(birdsCount.get(types[i]) > max){
	            	 max = types[i];
	             }
	     	}
	         else
	        	 birdsCount.put(types[i], 1);
	     }
	     
	}
}
