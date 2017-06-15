package numberlogics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;


public class Votes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] votes = {"Victors","Victors","Victor","Nehaal","Nehaal","Hemant"};
		System.out.println(electionWinner(votes));
	}
	public static String electionWinner(String[] votes) {
		int maxValue = 0;
        HashMap<String,Integer> myMap = new HashMap<String,Integer>();
        for(int i=0;i<votes.length;i++){
        	if(myMap.containsKey(votes[i]))
            {
                myMap.put(votes[i], myMap.get(votes[i])+1);
                if(myMap.get(votes[i]) > maxValue){
            		maxValue = myMap.get(votes[i]);
            	}
            } 
            else
                myMap.put(votes[i], 1);
        }
        SortedSet<String> set2 = new TreeSet<String>();
        for(String maxVotes : myMap.keySet()){
        	if(myMap.get(maxVotes) == maxValue){
        		set2.add(maxVotes);
        	}
        }
        return set2.first();
    }

}
