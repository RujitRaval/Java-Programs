class a extends Thread
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
class thread2
{
	public static void main(String args[])
	{
		new a().start();
	}
}