public class BitwiseOperators {
	public static void main(String[] args) {
		int x = 4;
		int y = 4;
		int z = -4;
		
		// Signed left shift operator
		System.out.println("x << 1 = " + (x << 1) + ", binary representation: " + Integer.toBinaryString(x << 1));
		
		// Signed right shift operator
		System.out.println("x >> 1 = " + (x >> 1) + ", binary representation: " + Integer.toBinaryString(x >> 1));
		
		// Usigned right shift operator
		System.out.println("z >>> 1 = " + (z >>> 1) + ", binary representation: " + Integer.toBinaryString(z >>> 1));
		
		// Bitwise AND operator
		System.out.println("x & y = " + (x & y) + ", binary representation: " + Integer.toBinaryString(x & y));
		
		// Bitwise exclusive OR operator
    System.out.println("x ^ y = " + (x ^ y) + ", binary representation: " + Integer.toBinaryString(x ^ y));
	    
    // Bitwise inclusive OR operator
    System.out.println("x | y = " + (x | y) + ", binary representation: " + Integer.toBinaryString(x | y));
    
    int i = 10;
    int n = ++i%5;

    System.out.print(n);
	}
}