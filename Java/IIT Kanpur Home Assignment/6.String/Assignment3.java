/*
WAP to accept a string from the user and find out the following statistics:
1. count of uppercase character
2. count of lowercase character
3. count of digits
4. count of Spaces
*/

class Assignment3
{
	public static void main(String[] arg)
	{
		String s1="  java is Programming Language. ";
		s1=s1.toUpperCase();
		System.out.println(s1);
		s1=s1.toLowerCase();
		System.out.println(s1);
		int x=s1.length();
		System.out.println(x);
		s1=s1.trim();
		System.out.println(s1);
	}
}
