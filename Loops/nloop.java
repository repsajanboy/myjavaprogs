class nloop
{
	public static void main (String [] args)
	{
	int row=1;
	while (row<=5)
	{
	for( int col=5; col>=row; col--)
	System.out.print(col + " ");
	System.out.println();
	row++;
	}
	}
}
	