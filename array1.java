import java.io.DataInputStream;

class array1
{
	public static void main(String args[])
	{
		int array[][]=new int[4][3];
		int r[]=new int[4];
		int c[]=new int[3];

		DataInputStream m = new DataInputStream(System.in);

		try
		{
		for(int i=0;i<4;i++)
		{
			r[i]=0;
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter Value:");
				array[i][j] = Integer.parseInt(m.readLine());
				r[i]+=array[i][j];				
			}
		}
		}
		catch(Exception e){}

		for(int i=0;i<4;i++)
		{
			System.out.println("Sum of row ="+r[i]);
		}

		for(int i=0;i<3;i++)
		{
			c[i]=0;
			for(int j=0;j<4;j++)
			{
				c[i]+=array[j][i];				
			}
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Sum of column="+c[i]);
		}
				
	}
}