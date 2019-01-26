import java.util.*;

class Season
{
public static void main(String args[])
{

Scanner m = new Scanner(System.in);
System.out.println("Enter the month");
int month= m.nextInt();


	if(month==12 || month==1 || month==2)
	{
		System.out.println("Season is WINTER.");
	}
	else if(month==3 || month==4 || month==5)
	{
		System.out.println("Season is SPRING.");
	}
	else if(month==6 || month==7 || month==8)
	{
		System.out.println("Season is SUMMER.");
	}
	else if(month==9  || month==10 || month==11)
	{
		System.out.println("Season is AUTUMN.");
	}
	else
	{
		System.out.println("Please Provide Appropriate No.");
	}
}
}
