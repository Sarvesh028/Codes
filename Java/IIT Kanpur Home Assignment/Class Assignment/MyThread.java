class MyApplication
{
	synchronized void printTable(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
}
class MyThread extends Thread
{
	int n;
	MyApplication ob=new MyApplication();
	public MyThread(int num)
	{
		n=num;
	}
	public void run()
	{
		ob.printTable(n);
	}
	public static void main(String[] arg)
	{
		MyThread thread1=new MyThread(5);
		MyThread thread2=new MyThread(2);
		thread1.start();
		try
		{
			thread1.join();
		}
		catch(Exception e)
		{}
		thread2.start();

		try
		{
			thread2.join();
		}
		catch(Exception e)
		{}
	}
}