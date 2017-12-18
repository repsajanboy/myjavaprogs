import java.util.Scanner;
class nloop2v3
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	System.out.print("Please enter number ");
	int number= input.nextInt();
	int col=1;
	while(col<=number)
	{
	for (int i =number; i <= col; i++) {
      for (int j = number; j <= col; j++) {
        System.out.print("*");      
      }
      System.out.println();

	System.out.print(row + " ");
	System.out.println();
	col++;
	}
	}
	}
}