package operators;

public class LogicalNotOperator {

	public static void main(String[] args) {

		boolean isRaining = true;

		// Condition: If it's NOT raining, go outside
		boolean canGoOutside = !isRaining;

		System.out.println("Can go outside: " + canGoOutside); // Output: false

	}

}

/*
 * Logical NOT (!): Reverses a boolean value (true → false, false → true). Used
 * to negate a condition.
 * 
 * Explanation: isRaining → true !isRaining → false (negation of true) Since
 * it's raining, the person cannot go outside (false).
 */
