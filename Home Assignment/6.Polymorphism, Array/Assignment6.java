//WAP to copy the element of one array into another array.
class Assignment6
{
	public static void main(String[] arg)
	{
		int[] marks1=new int[]{4,56,25,86,465,7};
		int[] marks2=new int[]{4,56,25,86,465,7};
		for(int i=0; i<6; i++)
		{
			marks1=marks2;
		}
		System.out.println("Element of original array:");
		for(int i=0; i<6; i++)
		{
			System.out.println(marks1[i]);		
		}
		System.out.println();
		System.out.println("Element of new Array.");
		for(int i=0; i<6; i++)
		{
			System.out.println(marks2[i]);
		}
	}
}