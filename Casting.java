class Casting
{
	public static void main(String args[])
	{
		byte b;
		int a=230;
		double c=325.147;
		{
			System.out.println("conversion of int to byte");
			b=(byte)a;
			System.out.println("b:"    +b + "a:"    +a);
			System.out.println("conversion of double to int");
			a=(int)c;
			System.out.println("c:"    +c + "a:"   +a);
			System.out.println("conversion of double to byte");
			b=(byte)c;
			System.out.println("c:"    +c+ "b:"     +b);
		}
	}
}
			
			

