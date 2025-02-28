package operators;

public class ShortCircuitBehavior {

	public static void main(String[] args) {
		int x = 5;

		// The second condition is NOT evaluated because x < 10 is already true
		boolean result = (x < 10) || (++x > 10);

		System.out.println("Result: " + result); // Output: true
		System.out.println("Value of x: " + x); // Output: 5 (unchanged)

	}

}

/*
 * Short-Circuit Behavior: Logical operators evaluate expressions from left to
 * right: && → Stops if the first condition is false (because the result will
 * always be false). || → Stops if the first condition is true (because the
 * result will always be true).
 *
 * Explanation: x < 10 → true Since || needs only one true condition, the second
 * condition (++x > 10) is not checked. x remains 5 instead of increasing.
 */
