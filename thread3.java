class a implements Runnable
{
	public void run()
	{
		char ch='a';
		for(int i =0;i<26;i++)
		{
			System.out.println(ch);
			ch++;
		}
	}
}
class thread3
{
	public static void main(String args[])
	{
		a runnable = new a();
		Thread a1 = new Thread(runnable);
		a1.start();
	}
}