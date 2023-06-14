/*WAP to take input of 5 subject marks and display the grade according to table:
>=90                     A+
>=80 and <90             A
>=70 and <80             B+
>=60 and <70             B
>=50 and <60             c
<50                      Fail
*/
import java.util.Scanner;
class Assignment7
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		if(marks>=90)
		{
			System.out.println("Congratulation Keep it up \"A+\"");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("Congratulations \"A\"");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("Excellent \"B+\"");
		}
		else if(marks>=60 && marks<70)
		{
			System.out.println("Very good \"B\"");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("Good \"c\"");
		}
		else if(marks<50)
		{
			System.out.println("Do more hard work \"Fail\"");
		}
		else if(marks<=100)
		{
			System.out.println("Please enter a valid marks of Student:");
		}
	}
}