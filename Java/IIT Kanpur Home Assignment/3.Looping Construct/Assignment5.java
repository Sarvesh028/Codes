//WAP to find y to the power of x .
class Assignment5
{
	public static void main(String[] arg)
	{
		int x=2, y=3;
		long pow=1;
		for(int i=1; i<=y; i++)
		{
			pow=pow*x;            //pow=1*2=2    //pow=2*2=4     //pow=4*2=8
		}
		System.out.println(pow);
	}
}