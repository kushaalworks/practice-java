package logicbuildingexercises.exercises;

public class FindProductOfDigitsOfAGivenNumber {
	public static int productOfDigits(int num) {
		num = Math.abs(num); // Handle negative numbers
		int product = 1;
		if (num == 0)
			return 0; // Special case: product of digits of 0 is 0
		while (num > 0) {
			product *= num % 10; // Extract last digit and multiply with product
			num /= 10; // Remove last digit
		}
		return product;
	}

	public static void main(String[] args) {
		int num = 1234;
		System.out.println("Product of digits: " + productOfDigits(num));
	}
}
