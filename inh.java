class staff
{
	int code;
	String name = new String();
		
	void getstaff(int x, String s)
	{
		code = x;
		name = s;
	}
}

class typist extends staff
{
	int speed;
	
	void getspeed(int y)
	{
		speed = y;
	}
}

class casual extends typist
{
	int wages;
	
	void getwages(int z)
	{
		wages = z;
	}
	
	void showdata()
	{
		System.out.println("Code is : "+code);
		System.out.println("Name is : "+name);
		System.out.println("Speed is : "+speed);
		System.out.println("Wages is : "+wages);
		
	}
}

class inh
{
	public static void main(String args[])
	{
		casual c1 = new casual();
		c1.getstaff(1,"Rujit");
		c1.getspeed(44);
		c1.getwages(1000);
		c1.showdata();
	}
}