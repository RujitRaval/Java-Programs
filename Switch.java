import java.util.*;

class Switch
{
public static void main(String args[])
{

Scanner m = new Scanner(System.in);
System.out.println("Enter the DAY :");
int month= m.nextInt();

switch(month)
{
		case 1:
			System.out.println("The day is sunday");
			break;
		case 2:
			System.out.println("The day is Monday");
			break;
		case 3:	
			System.out.println("The day is Tuesday");
			break;
		case 4:
			System.out.println("The day is Wednesday");
			break;
		case 5:
			System.out.println("The day is Thursday");
			break;
		case 6:
			System.out.println("The day is Friday");
			break;
		case 7:
			System.out.println("The day is Saturday");
			break;
		default:
			System.out.println("Enter proper number");
			break;
		}	


}
}
