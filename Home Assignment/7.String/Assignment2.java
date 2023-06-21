//WAP to enter a sentence from keyboard and also find all the words in that sentence
//with starting character as vowel.

import java.util.Scanner;
class Assignment2
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String:");
		String s1=sc.nextLine();
		String[] a1=s1.split(" ");
		for(String s : a1)
		{
			char ch=s.charAt(0);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			{
				System.out.println(s);
			}
		}
	}
}