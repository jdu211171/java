public class BitwiseComplement{
	public static void main(String[] args){
		int x = 5;
		int y = ~x;
		System.out.println("x = " + x + ", binary representation: " + Integer.toBinaryString(x));
		System.out.println("y = " + y + ", binary representation: " + Integer.toBinaryString(y));
	}
}