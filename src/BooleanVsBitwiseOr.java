public class BooleanVsBitwiseOr {
	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		
		System.out.println("a || b = " + (a || b));
		
		int x = 5;
    int y = 3;
    // Bitwise OR operator
    System.out.println("x | y = " + (x | y) + ", binary representation: " + Integer.toBinaryString(x | y));
	}
}