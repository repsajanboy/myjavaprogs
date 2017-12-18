import java.util.Scanner;
class arrayact2v2
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	int [] C = new int [20];
	int sum=0;
	int number;
	System.out.println("Please Enter 20 numbers: ");
	for( int j=0; j<=number; j++){
	number= input.nextInt();
	sum+=j;
	}
	System.out.print("The sum of your 20 numbers is: "+sum);
	}
}