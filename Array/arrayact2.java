import java.util.Scanner;
class arrayact2
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	int sum=0;
	System.out.print("Please Enter 20 numbers: ");
	for( int j=0; j<20; j++){
	int x= input.nextInt();
	int [] C = new int [20];
	sum=sum+x;
	}
	System.out.print("The sum of your 20 numbers is: "+sum);
	}
}