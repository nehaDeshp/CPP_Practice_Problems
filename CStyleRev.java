package strings;

public class CStyleRev {
		public static void main(String[] args) {
			String str = "hello\0";
			CStyleRev obj = new CStyleRev();
			System.out.println(obj.reverse(str));
		}
		public String reverse(String str)
		{
			int len = str.length()-1;
			System.out.println(len);
			String rev="";
			for(int i=0;i<str.length()-1;i++)
			{
				rev = rev+str.charAt(len-1);
				len--;
				
			}
			System.out.println(rev);
			return rev;
			
		}
}
