package operators;

public class LogicalOrOperator {

	public static void main(String[] args) {
		boolean hasDrivingLicense = false;
		boolean hasLearnerPermit = true;

		// Condition: Can drive if they have either a driving license OR a learner's
		// permit
		boolean canDrive = hasDrivingLicense || hasLearnerPermit;

		System.out.println("Can drive: " + canDrive); // Output: true

	}

}

/* Logical OR (||):
		Returns true if at least one condition is true.
		Returns false only if both conditions are false.
	
*	Explanation:
		hasDrivingLicense → false
		hasLearnerPermit → true
		Since one condition is true, (hasDrivingLicense || hasLearnerPermit) evaluates to true.
 * 
 */
