package strings;

import java.util.Scanner;
import java.util.Stack;

public class ChkBrackets {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next(); 
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
    public static boolean isBalanced(String s){
        for(int i=0;i<s.length();i++){
            Stack<Character> stk= new Stack<Character>();
            if(s.charAt(i) == '{' ||s.charAt(i) == '(' ||s.charAt(i) == '['){
                stk.push(s.charAt(i)); 
            } 
            else
            {
                if(!stk.pop().equals(s.charAt(i))){
                   return true;
                }
            }
        }
        return false;
    }
}
