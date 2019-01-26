import java.io.DataInputStream;

class sum
{
	int a,b,c;
	DataInputStream m = new DataInputStream(System.in);

	void input()
	{
		try
		{
			System.out.println("Enter Value 1 :");
			a = Integer.parseInt(m.readLine());
			System.out.println("Enter Value 2 :");
			b = Integer.parseInt(m.readLine());
		}
		catch(Exception e){}
		c = a + b;
	}	

	void show()
	{
		System.out.println("Addition of "+a+" and "+b+" = "+c);
	}
}

class p7
{
	public static void main(String args[])
	{
		sum s = new sum();
		s.input();
		s.show();	
	}
}


