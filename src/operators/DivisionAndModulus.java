package operators;

public class DivisionAndModulus {
	public static void main(String[] args) {
		// Integer Division
		int a = 15, b = 4;
		System.out.println("Integer Division: " + (a / b)); // 15 / 4 = 3
		System.out.println("Modulus: " + (a % b)); // 15 % 4 = 3

		// Floating-point Division
		double x = 15.0, y = 4.0;
		System.out.println("Floating-Point Division: " + (x / y)); // 15.0 / 4.0 = 3.75

		// Mixed Data Type Division
		int intValue = 15;
		double doubleValue = 4.0;
		System.out.println("Mixed Division (int / double): " + (intValue / doubleValue)); // 15 / 4.0 = 3.75
		System.out.println("Mixed Division (double / int): " + (doubleValue / intValue)); // 4.0 / 15 = 0.266...

		// Modulus with Floating Point Numbers
		System.out.println("Modulus with double: " + (15.5 % 4)); // 15.5 % 4 = 3.5
	}
}