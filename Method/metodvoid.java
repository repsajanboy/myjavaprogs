class metodvoid
{
	public static void main(String [] args)
	{
	sum(1, 10);
	sum(20, 30);
	sum(35, 45);
	}
	public static void sum(int i1, int i2)
	{
	int sum=0;
	for(int i=i1; i<=i2; i++)
	sum+=i;
	System.out.println("Sum from "+ i1 +" to " +i2 +" is "+ sum);
	}
}