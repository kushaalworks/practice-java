package logicbuildingexercises.exercises;

public class MostFrequentlyOccuringDigitInAGivenNumber {
	public static int mostFrequentDigit(int num) {
		num = Math.abs(num); // Handle negative numbers

		int[] frequency = new int[10]; // To store frequency of digits 0-9

		// Extract digits and update frequency array
		while (num > 0) {
			int digit = num % 10; // Get last digit
			frequency[digit]++; // Increment count
			num /= 10; // Remove last digit
		}

		// Find the digit with the maximum frequency
		int maxFreq = 0;
		int mostFrequentDigit = 0;

		for (int i = 0; i < 10; i++) {
			if (frequency[i] > maxFreq || (frequency[i] == maxFreq && i > mostFrequentDigit)) {
				maxFreq = frequency[i];
				mostFrequentDigit = i;
			}
		}

		return mostFrequentDigit;
	}

	public static void main(String[] args) {
		int num = 1223334444; // Sample Input
		System.out.println("Most Frequent Digit: " + mostFrequentDigit(num));
	}
}
