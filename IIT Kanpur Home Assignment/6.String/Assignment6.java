//WAP to create a string array that hold the name of 6 person sorting on that array.
import java.util.Scanner;
class Assignment6
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		String[] names=new String[6];
		System.out.println("Enter The Names of 6 Person.");
		for(int i=0; i<6; i++)
		{
			names[i]=sc.nextLine();
		}
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5-1; j++)
			{
				if(names[j].compareTo(names[j+1])>0)
				{
					String temp=names[j];
					names[j]=names[j+1];
					names[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting Person Nmaes are :");
		for(int i=0; i<6; i++)
		{
			System.out.println(names[i]);
		}
	}
}