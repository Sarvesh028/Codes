//WAP to check whether an input character is an alphabet, digit or special character.
import java.util.Scanner;
class Assignment11
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any character");
		char ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println("This is Alphabet");
		else if(ch>='0' && ch<='9')
			System.out.println("It is Digit");
		else
			System.out.println("It is Special Character ");
	}
}