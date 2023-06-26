//WAP to read a day number from user and print there corresponding day name.
import java.util.Scanner;
class Day
{
	public static void main(String [] ard)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day Number :");
		int day=sc.nextInt();
		switch(day)
		{
			case 1:
				System.out.println("Monday");
			break;
			case 2:
				System.out.println("Tuesday");
			break;
			case 3:
				System.out.println("Wednesday");
			break;
			case 4:
				System.out.println("Thrusday");
			break;
			case 5:
				System.out.println("Friday");
			break;
			case 6:
				System.out.println("Saturday");
			break;
			case 7:
				System.out.println("Sunday");
			break;
			default:
				System.out.println("Enter Valid Day.........:)");
			break;
		}
	}
}