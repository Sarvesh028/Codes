import java.util.*;
class MapExample
{
	public static void main(String[] arg)
	{
		TreeMap<Integer, String> list1=new TreeMap<Integer,String>();
		//how we can add an element in map collection
		list1.put(1007,"Rahul Sharma");
		list1.put(1002,"Amit kumar");
		list1.put(1005,"Rajat");	
		list1.put(1010,"MS Dhoni");
		//how we can reterive the data from map collection
		Set<Map.Entry<Integer,String>> s1=list1.entrySet();
		for(Map.Entry e : s1)
		{
			System.out.println(e.getKey()+ " "+e.getValue());
		}
	}
}