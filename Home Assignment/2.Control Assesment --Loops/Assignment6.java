//check it is vowel and consonant using switch.
import java.util.Scanner;
class Assignment6
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("This is vowel");
				break;
			default:
				System.out.println("This is consonant");
		}
	}
}