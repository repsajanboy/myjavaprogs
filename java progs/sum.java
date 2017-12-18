import java.util.Scanner;
class sum
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int n1= input.nextInt();
	int n2= input.nextInt();
	System.out.println("The sum of two numbers is: " + (n1+n2));
	}
}