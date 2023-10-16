//WAP to find number of days in a month using switch statement.
import java.util.Scanner;
class Assignment17
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1 to 12, to show the month with days:");
		int month=sc.nextInt();
		switch(month)
		{
			case 1:
				System.out.println("January.\n\n31days:");
				break;
			case 2:
				System.out.println("February.\n\n28 or 29days:");
				break;
			case 3:
				System.out.println("March.\n\n31days:");
				break;
			case 4:
				System.out.println("April.\n\n30days:");
				break;
			case 5:
				System.out.println("May.\n\n31days:");
				break;
			case 6:
				System.out.println("June.\n\n30days:");
				break;
			case 7:
				System.out.println("July.\n\n31days:");
				break;
			case 8:
				System.out.println("August.\n\n31days:");
				break;
			case 9:
				System.out.println("September.\n\n30days:");
				break;
			case 10:
				System.out.println("October.\n\n31days:");
				break;
			case 11:
				System.out.println("November.\n\n30days:");
				break;
			case 12:
				System.out.println("December.\n\n31days:");
				break;
			default:
				System.out.println("Please enter valid input.....\n\n\t.............");
				break;
		}
	}
}
