//WAP to take input of character and check it is vowel or consonant.
import java.util.Scanner;
class Assignment5
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character :");
		char ch=sc.next().charAt(0);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	System.out.println("This is vowel");
else
	System.out.println("This is not vowel");
	}
}