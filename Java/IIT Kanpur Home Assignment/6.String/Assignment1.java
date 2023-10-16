//WAP that reads a string and determines whether it is a palindrome.
import java.util.Scanner;
class Assignment1
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		StringBuffer s1=new StringBuffer(sc.nextLine());
		StringBuffer s2=new StringBuffer();
		s2.append(s1.toString());
		s1.reverse();
		if(s1.toString().equals(s2.toString()))
			System.out.println("String is Palindrome");
		else	
			System.out.println("String is not Palindrome");
	}
}
