package strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateString {
	public static void main(String[] args) {
		DuplicateString d = new DuplicateString();
		System.out.println(d.isDuplicate("hello"));
	}
	String isDuplicate(String str){
		List<Character> set = new ArrayList<Character>();
        for(int i=0;i<str.length();i++)
        {
        	if(!set.contains(str.charAt(i)))
            	set.add(str.charAt(i));
        }
        Iterator<Character> it = set.iterator();
        String s = "";
        while(it.hasNext()){
        	s = s+it.next();
        }
        return s;
    }
		
}
