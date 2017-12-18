import java.util.Scanner;
class height
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	System.out.print("Enter your height(Feet Inches)?");
	double feet= input.nextDouble();
	double inches= input.nextDouble();
	System.out.print("Thank You!" + "\nYour height is "
	+ ((feet*12)+inches)*2.54 + "centimeters tall");
	}
}