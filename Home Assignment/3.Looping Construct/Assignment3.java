//WAP to check a given number is palindrome or not. ( If reverse of a number and number is same, then it is called palindrome).
class Assignment3
{
	public static void main(String[] arg)
	{
		int n=123;
		int n2=n;
		int rev=0;
		while(n!=0)
		{
			int r=n%10;         /* r=3         r=2             r-1*/
			rev=rev*10+r;       /* rev=0+3=3   rev=3*10+2=32   rev=32*10+1=321*/
			n=n/10;             /* n=12        n=1             n=0*/
		}
		if(n2==rev)
			System.out.println("Pallindrome");
 		else 
			System.out.println("Is not pallindrome");
	}
}
