//WAP to store the name of student in a Map collection and perform the following task;
import java.util.Scanner;
import java.util.*;
class Mapping1
{
	public static void main(String[] arg)
	{
		TreeMap<Integer, String> list1=new TreeMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		//how we can add an element in map collection
		System.out.println("Enter the Student Record");
		String stu=sc.nextLine();
		//how we can reterive the data from map collection
		Set<Map.Entry<Integer,String>> s1=list1.entrySet();
		for(Map.Entry e : s1)
		{
			System.out.println(e.getKey()+ " "+e.getValue());
		}
	}
}