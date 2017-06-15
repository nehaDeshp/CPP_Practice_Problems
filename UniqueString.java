package strings;

public class UniqueString {
	public boolean isUnique(String str)
	{
		int count=0;
		int count1=0;
		for(int i=0;i<str.length();i++)
		{
			count1++;
			for(int j=0;(j<str.length()&&j!=i);j++)
			{
				count++;
				if((str.charAt(i)==str.charAt(j))) 
				{
					System.out.println(count);
					System.out.println(count1);
					return false;
				}
					
			}
		}
		System.out.println(count);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueString s = new UniqueString();
		System.out.println(s.isUnique("hello"));
	}

}
