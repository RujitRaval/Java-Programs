interface Area
{
	final static float pi = 3.14F;
	float compute(float x, float y);
}

class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return(x*y);
	}
}

class Circle implements Area
{
	public float compute(float x,float y)
	{
		return(x*x*pi);
	}	
}

class inter
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Area a;

		a=r;
		System.out.println("Area of rectangle is "+a.compute(10,20));

		a=c;
		System.out.println("Area of circle is "+a.compute(10,0));
	}
}