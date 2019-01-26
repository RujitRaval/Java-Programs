class NestedIf
{
public static void main(String args[])
{
int a=2;
int b=3;
int c=1;

if(a<b)
{
	if(a<c)
	{
		System.out.println(a +" is the smaller than "+ b +" & "+ c);
	}
	else
	{
		System.out.println(c +" is the smaller than "+ a +" & "+ b);
	}

}
else
{

	if(b<c)
	{
		System.out.println(b +" is the smaller than "+ a +" & "+ c);
	}
	else
	{
		System.out.println(c +" is the smaller than "+ b +" & "+ a);
	}


}

}
}
