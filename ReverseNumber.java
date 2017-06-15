package numberlogics;

public class ReverseNumber {
	public static long reverse(long n) {
	    return reverse(n, 0);
	}

	private static long reverse(long n, long m) {
	    return n == 0 ? m : reverse(n / 10, m * 10 +  n % 10);
	}

	public static void main(String... ignored) {
	    System.out.println(reverse(192345678));
	}
    
}
