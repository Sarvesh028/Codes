class Test
{
	float x;
	public Test()
	{
		x=8.0f;
	}
	public Test(float a)
	{
		x=a;
	}
}
class Test1
{
	public static void main(String[] arg)
	{
		Test ob=new Test();
		System.out.println(ob.x);
		Test ob1=new Test();
		System.out.println(ob1.x);
		Test ob2=new Test(1.1f);
		System.out.println(ob2.x);
		Test ob3=new Test(2.2f);
		System.out.println(ob3.x);
	}
}
