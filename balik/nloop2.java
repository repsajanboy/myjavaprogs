import java.util.*;
class nloop2
{
	public static void main(String [] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter number: ");
	int num = in.nextInt();
	int row=1;
	while (row<=num)
	{
	for( int col=num; col>=row; col--)
	System.out.print(col + " ");
	System.out.println();
	row++;
	}
	}
}