class metodexam
{
	public static void main(String [] args)
	{
	int a, b, c;
	a=10;
	b=20;
	c=30;
	System.out.print(figure_me_out(a,b,c) + a + b + c);
	}
	public static figure_me_out(int x, int y, int z)
	{
	System.out.println(x+ " " + y + " " +z);
	x=1;
	y=2;
	z=3;
	System.out.println(x + " " + y + " " +z);
	return(x+y+z);
	}
}