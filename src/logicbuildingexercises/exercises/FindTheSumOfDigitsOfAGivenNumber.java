package logicbuildingexercises.exercises;

public class FindTheSumOfDigitsOfAGivenNumber {
	public static int sumDigits(int num) {
		num = Math.abs(num); // Handle negative numbers
		int sum = 0;
		while (num > 0) {
			sum += num % 10; // Extract last digit and add to sum
			num /= 10; // Remove last digit
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 12345;
		System.out.println("Sum of digits: " + sumDigits(num));
	}
}
