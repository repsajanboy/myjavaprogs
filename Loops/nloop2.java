import java.util.Scanner;
class nloop2
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	System.out.print("Please enter number ");
	int number= input.nextInt();
	int row=1;
	while(row<=number)
	{
	for(int col=number; col>=row; col--)
	System.out.print(col + " ");
	System.out.println();
	row++;
	}
	}
}