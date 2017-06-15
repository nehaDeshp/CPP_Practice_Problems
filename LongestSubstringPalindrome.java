package strings;

public class LongestSubstringPalindrome {
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("ab"));
	}
	public static String longestPalindrome(String s) 
	{
		int len = s.length();
		String tmp = "" + s.charAt(0);
		for(int i=0;i<=s.length()/2;i++,len--)
		{
			if(chkPalindrome(s.substring(i,len)) && i< len)
			{
				return s.substring(i,len);
			}
		}
		return tmp;
    }
	public static boolean chkPalindrome (String s){
		if(s.length() <= 1)
			return true;
		else
		{
			int start = 0;
			int end = s.length()-1;
			while(start < end){
				if(s.charAt(start) != s.charAt(end)){
					return false;
				}
				else{
					start++;
					end--;
				}
			}
		}
		return true;
	}

}
