/*WAP to accept a grade and declare the equivalent description. 
Grade               Description 
E                   Excellent 
V                   Very Good 
G                   Good 
A                   Average  
F                   Fail
*/
import java.util.Scanner;
class Assignment20
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Write the grade '1=E', '2=V', '3=G', '4=A', '5=F'.");
		char grade=sc.next().charAt(0);
		switch(grade)
		{
			case 1:
				System.out.println("Excellent.");
				break;
			case 2:
				System.out.println("Very Good.");
				break;
			case 3:
				System.out.println("Good.");
				break;
			case 4:
				System.out.println("Average.");
				break;
			case 5:
				System.out.println("Fail.");
				break;
			default:
				System.out.println("Invalid ......");
				break;
		}

	}
}