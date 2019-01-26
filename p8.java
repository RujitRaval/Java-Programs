import java.io.DataInputStream;

class sum
{
	int a,b,c;

	void input(int p, int q)
	{
		a = p;
		b = q;
		c = a + b;	
	}

	void display()
	{
		System.out.println(c);
	}
}

class p8
{
	public static void main(String args[])
	{
		DataInputStream in = new DataInputStream(System.in);

		sum s = new sum();
		int n=0,m=0;
		
		try
		{
			System.out.println("Enter Value 1 :");
			n = Integer.parseInt(in.readLine());
			System.out.println("Enter Value 2 :");
			m = Integer.parseInt(in.readLine());
		}
		catch(Exception e){}
	
		s.input(n,m);
		s.display();
	}
}