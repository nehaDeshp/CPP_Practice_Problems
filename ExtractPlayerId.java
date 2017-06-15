package strings;


public class ExtractPlayerId {
	public static void main(String args[]) throws Exception {

		String s= "[nba.p.1234] shoots the ball. Assist by [nba.p.4533]\n"
        		+ "[nba.p.45687] offensive rebound"; 
      
		String regeX = "/"+"\\"+"([^"+"\\"+")]*"+"\\"+")/g";
		
		
      	boolean bracketFound = false;
      	String p = s.replace(, '')  // remove text inside parens (& parens)
        .match(/(\S+)/g); 
      	//System.out.println(p);
      	
       	System.out.println("S = "+s);
       	System.out.println("P = "+p);
	}
}
