class metod
{
	public static void main(String [] args)
	{
	System.out.println("Sum form 1 to 10 is "+ sum(1, 10));
	System.out.println("Sum form 1 to 10 is "+ sum(20, 30));
	System.out.println("Sum form 1 to 10 is "+ sum(35, 45));
	}
	public static int sum( int i1, int i2)
	{
	int sum=0;
	for(int i=i1; i<=i2; i++)
	sum+=i;
	return sum;
	}
}