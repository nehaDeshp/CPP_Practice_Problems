package strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LongestSubstring {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}
	public static int lengthOfLongestSubstring(String s)
	{
		int count=0,maxCount=0;
		List<Character> myList = new ArrayList<Character>();
		for(int i=0,j=0;i<s.length();i++)
		{
			if(!myList.contains(s.charAt(i))){
				myList.add(s.charAt(i));
				count++;
				if(maxCount<count)
					maxCount=count;
			}
			else{
				myList.clear();
				count=0;
				j++;
				i=j-1;
			}
		}
		Iterator<Character> it = myList.iterator();
		return maxCount;
		
	}
}
