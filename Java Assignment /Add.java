import java.util.Scanner;

class Add {
	public static void main(String[] asr) {
		Scanner ad = new Scanner(System.in);
		System.out.println("Enter the two number :");
		int n1 = ad.nextInt();
		int n2 = ad.nextInt();
		System.out.println("Press 1 for Addition :");
		System.out.println("Press 2 for Subtraction :");
		System.out.println("Press 3 for Multiplication :");
		System.out.println("Press 4 for Division :");
		System.out.println("\n\nEnter your choice :");
		int choice = ad.nextInt();
		switch (choice) {
			case 1:
				System.out.println("Addition = " + (n1 + n2));
				break;
			case 2:
				System.out.println("Addition = " + (n1 - n2));
				break;
			case 3:
				System.out.println("Addition = " + (n1 * n2));
				break;
			case 4:
				System.out.println("Addition = " + (n1 / n2));
				break;
			default:
				System.out.println("Invalid Choice ");
				break;
		}
	}
}
