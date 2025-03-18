package logicbuildingexercises.docs.integerarrayexercises;
public class CheckIfAnArrayIsSortedInAscOrDesc  {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 2, 1 };

		// asc -> 1, 2, 3, 4, 5
		// -----------------
		// 0, 1, 2, 3, 4
		// -----------------
		// desc -> 5, 4, 3, 2, 1

		boolean ascending = true;
		boolean descending = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				ascending = false;
			}

			if (arr[i] > arr[i - 1]) {
				descending = false;
			}
		}

		if (ascending == true) {
			System.out.println("The array is ascending");
		} else if (descending == true) {
			System.out.println("The array is descending");
		} else {
			System.out.println("The array is unsorted");
		}
	}

}
