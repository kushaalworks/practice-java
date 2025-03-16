package logicbuildingexercises.exercises;

public class CountTheNumberOfDigitsInAGivenNumber {
	    public static int countDigits(int num) {
	        int count = 0;
	        num = Math.abs(num); // Handle negative numbers
	        do {
	            count++;
	            num /= 10; // Remove last digit
	        } while (num > 0);
	        return count;
	    }
	public static void main(String[] args) {
	        int num = -9876;
	        System.out.println("Number of digits: " + countDigits(num));
	    }
	}
