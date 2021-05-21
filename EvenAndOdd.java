import java.util.Scanner;

public class EvenAndOdd {

	static int[] array;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter number of elements");

		int arraySize = sc.nextInt();
		array = new int[arraySize];

		insertArray(arraySize);
		countEvenAndOdd(arraySize);

	}

	private static void countEvenAndOdd(int arraySizearraySize) {
		int evenCount = 0, oddCount = 0, i = 0;

		while (i < arraySizearraySize) {
			if (array[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			i++;
		}

		System.out.println("Total Even numbers in the array:" + evenCount);
		System.out.println("Total Odd numbers in the array:" + oddCount);

	}

	private static void insertArray(int arraySize) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element" + i + 1 + "th elemnet");
			array[i] = sc.nextInt();
		}
	}

}
