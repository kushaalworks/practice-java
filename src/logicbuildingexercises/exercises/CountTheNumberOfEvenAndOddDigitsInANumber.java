package logicbuildingexercises.exercises;

public class CountTheNumberOfEvenAndOddDigitsInANumber {

	public static void main(String[] args) {
		int num = 123456789;
		countEvenOdd(num);

	}

	public static void countEvenOdd(int num) {
		int evenCount = 0, oddCount = 0;
		num = Math.abs(num); // Handle negative numbers
		while (num > 0) {
			int digit = num % 10; // Extract the last digit
			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num /= 10; // Remove last digit
		}
		System.out.println("Even digits: " + evenCount);
		System.out.println("Odd digits: " + oddCount);
	}
}
