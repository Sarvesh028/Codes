
//WAP to perform the sum of all elements of 2-D array.
import java.util.Scanner;

class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number :");
		int r = sc.nextInt();
		System.out.println("Enter the column number :");
		int c = sc.nextInt();
		int[][] array = new int[r][c];
		System.out.println("Enter the element in Array :");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Transpose of matrix is :");
		for (int i = 0; i < c; i++) {
			for (int i = 0; i < r; i++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Sum of all the element of Array is :" + sum);
	}
}