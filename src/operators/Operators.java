package operators;

public class Operators {

	public static void main(String[] args) {

		// 1. Arithmetic Operators
		int a = 10, b = 5;
		System.out.println("Arithmetic Operators:");
		System.out.println("Addition: " + (a + b)); // 10 + 5 = 15
		System.out.println("Subtraction: " + (a - b)); // 10 - 5 = 5
		System.out.println("Multiplication: " + (a * b)); // 10 * 5 = 50
		System.out.println("Division: " + (a / b)); // 10 / 5 = 2
		System.out.println("Modulus: " + (a % b)); // 10 % 5 = 0
		System.out.println();
		
        // 2. Relational (Comparison) Operators
        System.out.println("Relational Operators:");
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println();
        
        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false
        System.out.println();
        
        // 4. Bitwise Operators
        int p = 5, q = 3; // 5 -> 0101, 3 -> 0011
        System.out.println("Bitwise Operators:");
        System.out.println("p & q: " + (p & q)); // 0101 & 0011 = 0001 (1)
        System.out.println("p | q: " + (p | q)); // 0101 | 0011 = 0111 (7)
        System.out.println("p ^ q: " + (p ^ q)); // 0101 ^ 0011 = 0110 (6)
        System.out.println("~p: " + (~p)); // Bitwise NOT of 5
        System.out.println();
        
        // 5. Assignment Operators
        int num = 10;
        System.out.println("Assignment Operators:");
        num += 5; // num = num + 5
        System.out.println("num += 5: " + num);
        num -= 3; // num = num - 3
        System.out.println("num -= 3: " + num);
        num *= 2; // num = num * 2
        System.out.println("num *= 2: " + num);
        num /= 4; // num = num / 4
        System.out.println("num /= 4: " + num);
        System.out.println();
        
        // 6. Unary Operators
        int u = 5;
        System.out.println("Unary Operators:");
        System.out.println("++u: " + (++u)); // Pre-increment
        System.out.println("u++: " + (u++)); // Post-increment
        System.out.println("--u: " + (--u)); // Pre-decrement
        System.out.println("u--: " + (u--)); // Post-decrement
        System.out.println();
        
        // 7. Ternary Operator
        int result = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("Result (larger value between a & b): " + result);

	}

}
