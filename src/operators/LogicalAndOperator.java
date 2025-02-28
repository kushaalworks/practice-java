package operators;


public class LogicalAndOperator {

	public static void main(String[] args) {
		int age = 20;
		int salary = 50000;

		// Condition: Age must be greater than 18 AND salary must be greater than 40000
		boolean eligibleForLoan = (age > 18) && (salary > 40000);

		System.out.println("Eligible for Loan: " + eligibleForLoan);
	}

}

/*
 * Logical AND (`&&`):
	Returns **true** only if **both** conditions are `true`.
	If **either condition** is `false`, the result is `false`.
 * Explanation:
	age > 18 → true
	salary > 40000 → true
	Since both conditions are true, (age > 18) && (salary > 40000) evaluates to true.
 */

