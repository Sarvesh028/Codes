class Stringbuffer4
{
	public static void main(String[] arg)
	{
		StringBuffer s1=new StringBuffer("Programming Language");
		s1.append("language");
		s1.insert(4,"  ");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
	}
}