import java.util.Scanner;

public class Cap2 {

	static Scanner sc = new Scanner(System.in);

	static int[][] twoDArray;

	public static void main(String[] args) {
		System.out.println("Enter the number of rows and colums for the 2d array");
		int rowAndCol = sc.nextInt();

		twoDArray = new int[rowAndCol][rowAndCol];
		
		//inserting array elements method
		insertArray(rowAndCol);
		System.out.println("Before swaping");
		displayArray();
		System.out.println("After swaping");
		swapColumns(rowAndCol);
		displayArray();

	}

	private static void displayArray() {
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray.length; j++) {
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void swapColumns(int rowAndCol) {
		for (int i = 0; i < twoDArray.length; i++) {
			int temp = twoDArray[i][0];
			twoDArray[i][0] = twoDArray[i][rowAndCol - 1];
			twoDArray[i][rowAndCol - 1] = temp;
		}

	}

	private static void insertArray(int rowAndCol) {

		System.out.println("Enter the array elements");
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray.length; j++) {
				System.out.println("Enter element of " + (i + 1) + " th row and " + (j + 1) + " the column");
				twoDArray[i][j] = sc.nextInt();
			}
		}

	}
}
